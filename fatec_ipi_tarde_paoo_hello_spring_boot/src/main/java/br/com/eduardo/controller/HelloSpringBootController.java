package br.com.eduardo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringBootController {
	
	// Padrão de atendimento de requisição
	
	@RequestMapping ("/hello")
	public String hello  () {
		return "hello_spring_boot";
	}
}
