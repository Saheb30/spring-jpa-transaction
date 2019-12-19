package org.saheb.controller;

import org.saheb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
	@Autowired
	private EmpService empService;
	@GetMapping("/insert")
	public ResponseEntity<String> insert(){
		System.out.println("inside controller");
		empService.insertSingleBatch();
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
