package com.programando.aula371.controller;

import com.programando.aula371.Pokemon;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    List<Pokemon> pokemons = new ArrayList<>();

    public PokemonController() {
        pokemons.add(new Pokemon(1, "Bulbasaur", Arrays.asList("grass", "poison")));
        pokemons.add(new Pokemon(2, "Ivysaur", Arrays.asList("grass", "poison")));
        pokemons.add(new Pokemon(3, "Venusaur", Arrays.asList("grass", "poison")));
        pokemons.add(new Pokemon(4, "Charmander", Arrays.asList("fire")));
        pokemons.add(new Pokemon(5, "Charmeleon", Arrays.asList("fire")));
        pokemons.add(new Pokemon(6, "Charizard", Arrays.asList("fire", "flying")));
        pokemons.add(new Pokemon(7, "Squirtle", Arrays.asList("water")));
        pokemons.add(new Pokemon(8, "Wartortle", Arrays.asList("water")));
        pokemons.add(new Pokemon(9, "Blastoise", Arrays.asList("water")));
        pokemons.add(new Pokemon(10, "Caterpie", Arrays.asList("bug")));
        pokemons.add(new Pokemon(11, "Metapod", Arrays.asList("bug")));
        pokemons.add(new Pokemon(12, "Butterfree", Arrays.asList("bug", "flying")));
        pokemons.add(new Pokemon(13, "Weedle", Arrays.asList("bug", "poison")));
        pokemons.add(new Pokemon(14, "Kakuna", Arrays.asList("bug", "poison")));
        pokemons.add(new Pokemon(15, "Beedrill", Arrays.asList("bug", "poison")));
        pokemons.add(new Pokemon(150, "Mewtwo", Arrays.asList("psychic")));
        pokemons.add(new Pokemon(462, "Magnezone", Arrays.asList("eletric", "steel")));
        pokemons.add(new Pokemon(294, "Loudred", Arrays.asList("normal")));
        pokemons.add(new Pokemon(185, "Sudowoodo", Arrays.asList("rock")));
    }

    @GetMapping
    public List<Pokemon> getPokemon(){
        return pokemons;
    }

    @PostMapping
    public String adicionarPokemon(@RequestBody Pokemon pokemon){
        pokemons.add(pokemon);
        return "O pokemon " + pokemon + " foi adicionado na lista!";
    }

}
