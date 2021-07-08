package com.itlize.assignments.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/admin")
@RestController
public class AdminController {


    @GetMapping("")
    public String user() {
        return "Only Admin role can see admin page";
    }


}
