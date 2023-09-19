package com.project.demo.controller;

import com.project.demo.model.TimeResponse;
import com.project.demo.service.TimeConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/time")
public class TimeConversionController {

    @Autowired
    private TimeConversionService timeConversionService;

    @GetMapping("/current")
    public TimeResponse getCurrentTimeInWords() {
        return timeConversionService.convertCurrentTimeToWords();
    }

    @PostMapping("/convert")
    public TimeResponse convertTimeToWords(@RequestParam String time) {
        return timeConversionService.convertTimeToWords(time);
    }
}

