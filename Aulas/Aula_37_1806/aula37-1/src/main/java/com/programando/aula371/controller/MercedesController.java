package com.programando.aula371.controller;

import com.programando.aula371.Mercedes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carros/mercedes")
public class MercedesController {

    List<Mercedes> mercedess = new ArrayList<>();

    public MercedesController() {
        mercedess.add(new Mercedes("Mercedes-AMG GT S", 2014));
        mercedess.add(new Mercedes("Mercedes-AMG GT Black Series", 2020));
        mercedess.add(new Mercedes("Mercedes-AMG GT R", 2021));
    }

    @GetMapping
    public List<Mercedes> getPokemon(){
        return mercedess;
    }

    @PostMapping
    public String adicionarMercedes(@RequestBody Mercedes mercedes){
        mercedess.add(mercedes);
        return "A Mercedes " + mercedes.getModelo() + " foi adicionado na lista!";
    }

}