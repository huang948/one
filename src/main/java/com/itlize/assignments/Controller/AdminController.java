//package com.itlize.assignments.Controller;
//
//import com.itlize.assignments.Entity.User;
//import com.itlize.assignments.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RequestMapping(path = "/admin")
//@RestController
//public class AdminController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/")
//    public String user() {
//        return "Only Admin role can see admin page";
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody User user) {
//        if (userService.findByUsername(user.getUsername()) != null) {
//            return new ResponseEntity<>(HttpStatus.CONFLICT);
//        }
//        user.setRole("ROLE_ADMIN");
//        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
//    }
//
//}
