package com.project.demo.controller;

import com.project.demo.model.TimeResponse;
import com.project.demo.service.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user-input")
public class UserController {

    @Autowired
    private UserInputService userInputService;

    @PostMapping("/time")
    public TimeResponse convertUserInputToWords(@RequestParam String userInput) {
        return userInputService.convertUserInputToWords(userInput);
    }
}
