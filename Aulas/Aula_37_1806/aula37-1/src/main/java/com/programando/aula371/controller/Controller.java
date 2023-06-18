package com.programando.aula371.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class Controller {

    @GetMapping
    public String inicio(){
        return "Olá usuário, você está na rota inicial, rotas disponíveis: /pokemons /carros";
    }

    @GetMapping("/carros")
    public String verMarcas(){
        return "Você está na rota de carros, rotas disponíveis: /mclaren /mercedes";
    }

}
