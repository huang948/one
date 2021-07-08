//package com.itlize.assignments.Controller;
//
//import com.itlize.assignments.Entity.User;
//import com.itlize.assignments.Service.MyUserDetailsService;
//import com.itlize.assignments.Service.UserService;
//import com.itlize.assignments.Util.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RequestMapping("/user")
//@RestController
//public class UserController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private JwtUtil jwtTokenUtil;
//
//    @Autowired
//    private MyUserDetailsService userDetailsService;
//
//    @GetMapping("/")
//    public String user() {
//        return "Both User and Admin roles can see the user page";
//    }
//
//    //sign in
//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception {
//
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
//            );
//        }
//        catch (BadCredentialsException e) {
//            throw new Exception("Incorrect username or password", e);
//        }
//
//
//        final UserDetails userDetails = userDetailsService
//                .loadUserByUsername(user.getUsername());
//
//        final String jwt = jwtTokenUtil.generateToken(userDetails);
//
//        return  new ResponseEntity<>(jwt, HttpStatus.OK);
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody User user) {
//        if (userService.findByUsername(user.getUsername()) != null) {
//            return new ResponseEntity<>(HttpStatus.CONFLICT);
//        }
//        user.setRole("ROLE_USER");
//        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
//    }
//
//
//
//}
