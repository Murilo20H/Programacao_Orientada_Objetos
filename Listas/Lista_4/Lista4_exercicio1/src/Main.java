public class Main {
    public static void main(String[] args)
    {
        Inimigo inimigo1 = new Inimigo("Revenant", 12, 5, 100);
        Inimigo inimigo2 = new Inimigo("Entombed", 10, 15, 200);
        Inimigo inimigo3 = new Inimigo("Bonewalker", 20, 3, 250);
        Mapa mapa = new Mapa("Three Houses", 10, 15);
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);
        Inimigo maiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println("Lista 4: exercício 1");
        System.out.println(maiorAtaque.getNome());
    }
}