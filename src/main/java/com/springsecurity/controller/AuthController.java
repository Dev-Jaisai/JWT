package com.springsecurity.controller;


import com.springsecurity.dto.AuthRequest;
import com.springsecurity.dto.CreateUserReq;
import com.springsecurity.model.AppUser;
import com.springsecurity.security.JwtProvider;
import com.springsecurity.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app-auth")
public class AuthController {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/token")
    public String getToken(@RequestBody AuthRequest authRequest) throws Exception {
        // Get user details
        UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());

        if(passwordEncoder.matches(authRequest.getPassword(), userDetails.getPassword())){
            // Generate token
            return jwtProvider.generateToken(authRequest.getUsername());
        }

        throw new Exception("User details invalid.");
    }

    @PostMapping("/createUser")
    public AppUser createUser(@RequestBody CreateUserReq req) throws Exception {
        return userDetailsService.createUser(req);
    }
}
