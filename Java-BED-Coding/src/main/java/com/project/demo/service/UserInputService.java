package com.project.demo.service;

import com.project.demo.*;
import com.project.demo.exception.InvalidTimeFormatException;
import com.project.demo.model.TimeResponse;
import org.springframework.stereotype.Service;

@Service
public class UserInputService {

	private final TimeConversionService timeConversionService;

	public UserInputService(TimeConversionService timeConversionService) {
		this.timeConversionService = timeConversionService;
	}

	public TimeResponse convertUserInputToWords(String userInput) {

		if (!isValidTimeFormat(userInput)) {
			throw new InvalidTimeFormatException("Invalid time format: " + userInput);
		}

		return timeConversionService.convertTimeToWords(userInput);
	}

	private boolean isValidTimeFormat(String userInput) {

		return userInput != null && !userInput.isEmpty();
	}
}
