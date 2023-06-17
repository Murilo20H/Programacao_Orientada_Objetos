package com.programando.elevaquadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/numero")
public class ElevaQuadradoApplication {

	@GetMapping
	public String explicacao(){
		return "Para elevar um número ao quadrado, digite /(número) na URL";
	}

	@GetMapping("/{numero}")
	public int elevaQuadrado(@PathVariable int numero){
		return numero * numero;
	}
	public static void main(String[] args) {
		SpringApplication.run(ElevaQuadradoApplication.class, args);
	}

}
