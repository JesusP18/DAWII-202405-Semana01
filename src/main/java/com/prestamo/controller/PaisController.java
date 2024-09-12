package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Pais;
import com.prestamo.service.PaisService;

@RequestMapping("/url/pais")
@RestController
public class PaisController {

	@Autowired
	private PaisService paisService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Pais>> getAllPaises(){
		
		return ResponseEntity.ok(paisService.findAll());
	}
	
	
}
