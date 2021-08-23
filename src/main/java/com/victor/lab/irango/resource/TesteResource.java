package com.victor.lab.irango.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteResource {
	@GetMapping
	public String teste() {
		return "sucesso";
	}
}
