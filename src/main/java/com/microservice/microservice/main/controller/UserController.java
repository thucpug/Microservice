package com.microservice.microservice.main.controller;

import com.microservice.microservice.main.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {
//    @GetMapping("")
//    public String getUsers() {
//
//        return "Get user was called";
//    }

    @GetMapping(path = "/{id}" )
    public User getUsers(@PathVariable String id) {
        User user = new User();
        user.setName("Thuc");
        return  user;
       // return "Get user was called " + id;
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1", required = true) int page,
                           @RequestParam(value = "limit", defaultValue = "10", required = true) int limit,
                           @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {

        return "Get user was called " + page + " " + limit + "and sort= " + sort;
    }

    @PostMapping
    public String createUser() {
        return "Create user was called";
    }

    @PutMapping
    public String updateUser() {
        return "Update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete user was called";
    }
}