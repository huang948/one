package com.itlize.assignments.Controller;

import com.itlize.assignments.Entity.ProjectColumn;
import com.itlize.assignments.Entity.ProjectResource;
import com.itlize.assignments.Entity.Resource;
import com.itlize.assignments.Entity.ResourceDetail;
import com.itlize.assignments.Service.ProjectColumnService;
import com.itlize.assignments.Service.ResourceDetailService;
import com.itlize.assignments.Service.ResourceService;
import org.hibernate.annotations.Columns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    @Autowired
    private ProjectColumnService projectColumnService;
    @Autowired
    private ResourceDetailService resourceDetailService;

    @GetMapping("/read")
    public ResponseEntity<?> read(){
        String body = resourceService.getAllJson();
        String columnDetails = projectColumnService.getColumnsJson(null);
        return new ResponseEntity<>(String.format("{\"columnInfo\":%s,\"tableDetail\":%s}", columnDetails,body), HttpStatus.OK);
    }

    @PostMapping("/addColumn")
    public ResponseEntity<?> addColumn(@RequestParam(name="columnName") String columnName){
        ProjectColumn columnToAdd = new ProjectColumn();
        columnToAdd.setColumnName(columnName);
        boolean isSuccessful = projectColumnService.create(columnToAdd);
        if(isSuccessful){
            return new ResponseEntity<>(columnToAdd,HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"error\":\"column name taken!\"}",HttpStatus.BAD_REQUEST);
    }
7
    @PostMapping("/deleteColumn")
    public ResponseEntity<?> deleteColumn(@RequestParam(name="columnName") String columnName){
        ProjectColumn columnToDelete = projectColumnService.get(null,columnName);
        boolean isSuccessful = projectColumnService.delete(columnToDelete);
        if(isSuccessful){
            return new ResponseEntity<>(columnToDelete,HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"error\":\"column does not exist!\"}",HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/updateColumn")
    public ResponseEntity<?> deleteColumn(@RequestParam(name="oldColumnName") String oldColumnName,@RequestParam(name = "newColumnName")String newColumnName){
        ProjectColumn columnToUpdate = projectColumnService.get(null,oldColumnName);
        boolean isSuccessful = projectColumnService.update(columnToUpdate,newColumnName);
        if(isSuccessful){
            return new ResponseEntity<>(columnToUpdate,HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"error\":\"column does not exist!\"}",HttpStatus.BAD_REQUEST);

    }

    @PostMapping("/addResource")
    public ResponseEntity<?> addResource(){
        ProjectResource resourceToAdd = new ProjectResource();
        resourceService.create(resourceToAdd);
        return new ResponseEntity<>(resourceToAdd, HttpStatus.OK);
    }

    @PostMapping("/deleteResource")
    public ResponseEntity<?> deleteResource(@RequestParam(name = "resourceId")Integer resourceId){
        Resource resourceToDelete = resourceService.get(resourceId);
        if(resourceToDelete==null){
            return new ResponseEntity<>("{\"error\":\"resource does not exist!\"}",HttpStatus.BAD_REQUEST);
        }
        boolean isSuccessful = resourceService.delete(resourceToDelete);
        return new ResponseEntity<>(resourceToDelete, HttpStatus.OK);
    }

    @PostMapping("/setEntry")
    public ResponseEntity<?> setEntry(@RequestParam(name = "resourceId")Integer resourceId,
                                      @RequestParam(name = "columnId")Integer columnId,
                                      @RequestParam(name = "value") String value){
        ProjectColumn column = projectColumnService.get(columnId);
        if(column == null){
            return new ResponseEntity<>("{\"error\":\"column does not exist!\"}",HttpStatus.BAD_REQUEST);
        }
        Resource resource = resourceService.get(resourceId);
        if(resource==null){
            return new ResponseEntity<>("{\"error\":\"resource does not exist!\"}",HttpStatus.BAD_REQUEST);
        }
        ResourceDetail rd = resourceDetailService.get(resource,column);
        if(rd==null){
            rd = new ResourceDetail();
            rd.setNewValue(value);
            resourceDetailService.create(rd,resource,column);
            return new ResponseEntity<>(rd, HttpStatus.OK);
        }
        rd.setNewValue(value);
        boolean isSuccessful = resourceDetailService.update(rd);
        if(isSuccessful){
            return new ResponseEntity<>(rd,HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"error\":\"sth wrong happens:(\"}",HttpStatus.BAD_REQUEST);
    }
}
