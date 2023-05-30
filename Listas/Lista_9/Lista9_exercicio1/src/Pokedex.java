import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons = new HashMap<>();
    public void adicionarPokemon(Pokemon pokemon){
        String idDoPokemon = pokemon.getCodigoIdentificador();
        pokemons.put(idDoPokemon, pokemon);
        System.out.println("O pokemon: " + pokemon.getNome() + ", de número " + pokemon.getCodigoIdentificador() + " na pokedex foi adicionado");
    }

    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }
}
