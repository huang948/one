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
    public ResponseEntity<?> user() {
        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> userUpdate(@PathVariable Integer userId, @RequestBody User user) {
        if (userService.get(userId) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No user found");
        }
        return new ResponseEntity<>(userService.update(userId, user), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable Integer userId) {
        if (userService.get(userId) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No user found");
        }
        return new ResponseEntity<>(userService.get(userId), HttpStatus.FOUND);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer userId) {
        if (userService.get(userId) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No user found");
        }
        userService.delete(userService.get(userId));
        return ResponseEntity.status(HttpStatus.OK).body("User deleted");
    }

    @GetMapping("/clear")
    public ResponseEntity<?> clear() {
        userService.clear();
        return ResponseEntity.status(HttpStatus.OK).body("All users deleted");
    }


}