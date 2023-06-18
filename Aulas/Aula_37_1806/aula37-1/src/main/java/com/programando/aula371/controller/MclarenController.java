package com.programando.aula371.controller;

import com.programando.aula371.Mclaren;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carros/mclaren")
public class MclarenController {

        List<Mclaren> mclarens = new ArrayList<>();

        public MclarenController() {
            mclarens.add(new Mclaren("McLaren Senna", 2018));
            mclarens.add(new Mclaren("McLaren P1", 2013));
            mclarens.add(new Mclaren("McLaren 765LT", 2017));
        }

        @GetMapping
        public List<Mclaren> getPokemon(){
            return mclarens;
        }

        @PostMapping
        public String adicionarMClaren(@RequestBody Mclaren mclaren){
            mclarens.add(mclaren);
            return "A McLaren " + mclaren.getModelo() + " foi adicionado na lista!";
        }

}
