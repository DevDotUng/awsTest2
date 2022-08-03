package com.keyword.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyword.api.entity.ScreenResult;
import com.keyword.api.service.ScreenService;

@RestController
@RequestMapping("/api/")
public class ScreenController {
	
	@Autowired
	ScreenService screenService;
	
	@GetMapping(value = "screen", produces = "application/json;charset=UTF-8")
	public ResponseEntity<ScreenResult> getScreen(String applicationId) {
		
		int id = Integer.parseInt(applicationId);
		
		ScreenResult screenResult = screenService.getScreenView(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(screenResult);
	}
}
