package com.example.pruebah2.controllers;

import com.example.pruebah2.models.User;
import com.example.pruebah2.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@Tag(name = "User", description = "User API")
public class UserController {
    final private UserService userService;

    @Operation(summary = "Create a new user")
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.createUser(user));
    }
    @Operation(summary = "Get all users")
    @GetMapping
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }
}
