package com.itlize.assignments.Controller;

import com.itlize.assignments.Entity.User;
import com.itlize.assignments.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public String user() {
        return "Both User and Admin roles can see the user page";
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> userUpdate(@PathVariable Integer userId, @RequestBody User user) {
        if (userService.get(userId) == null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.update(userId, user), HttpStatus.ACCEPTED);
    }


}
