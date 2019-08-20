package com.ten.service.currencyservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyController {
	
	@RequestMapping(value = "/healthCheck")
	public ResponseEntity<String> helthCheck()
	{
		return ResponseEntity.ok("UP");
	}

}
