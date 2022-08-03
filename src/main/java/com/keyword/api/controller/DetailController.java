package com.keyword.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyword.api.entity.DetailResult;
import com.keyword.api.service.DetailService;

@RestController
@RequestMapping("/api/")
public class DetailController {
	
	@Autowired
	private DetailService detailService;
	
	@GetMapping(value = "detail", produces = "application/json;charset=UTF-8")
	public ResponseEntity<DetailResult> getDetail(String applicationId) {
		if (applicationId == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); // 예외처리 만들자
		}
		
		int id = Integer.parseInt(applicationId);
		
		DetailResult detailResult;
		
		detailResult = detailService.getDetailView(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(detailResult);
	}
}
