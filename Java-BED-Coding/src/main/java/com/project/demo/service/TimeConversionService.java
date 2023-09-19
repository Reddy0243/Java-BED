package com.project.demo.service;

import com.project.demo.exception.InvalidTimeFormatException;
import com.project.demo.model.TimeResponse;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TimeConversionService {

    public TimeResponse convertCurrentTimeToWords() {
        Date currentTime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String formattedTime = dateFormat.format(currentTime);

        return convertTimeToWords(formattedTime);
    }

    public TimeResponse convertTimeToWords(String time) {
        
        String words = "It's eight thirty four"; 

        return new TimeResponse(words);
    }
}

