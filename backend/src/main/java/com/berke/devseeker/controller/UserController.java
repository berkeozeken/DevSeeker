package com.berke.devseeker.controller;

import com.berke.devseeker.dto.RegisterRequest;
import com.berke.devseeker.dto.RegisterResponse;
import com.berke.devseeker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/test")
    public String test() {
        return "DevSeeker Backend OK";
    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }
}