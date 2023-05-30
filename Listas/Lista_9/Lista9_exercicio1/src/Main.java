
public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("150", "Mewtwo", "Psíquico"));
        pokedex.adicionarPokemon(new Pokemon("384", "Rayquaza", "Dragão e Voador"));
        pokedex.adicionarPokemon(new Pokemon("382", "Kyogre", "Água"));
    }
}