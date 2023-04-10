public class Main {
    public static void main(String[] args)
    {
        Inimigo inimigo1 = new Inimigo();
        inimigo1.nome = "Revenant";
        inimigo1.ataque = 12;
        inimigo1.defesa = 5;
        inimigo1.pontos = 100;
        Inimigo inimigo2 = new Inimigo();
        inimigo2.nome = "Entombed";
        inimigo2.ataque = 10;
        inimigo2.defesa = 15;
        inimigo2.pontos = 200;
        Inimigo inimigo3 = new Inimigo();
        inimigo3.nome = "Bonewalker";
        inimigo3.ataque = 20;
        inimigo3.defesa = 3;
        inimigo3.pontos = 250;
        Mapa mapa = new Mapa();
        mapa.nome = "Three Houses";
        mapa.altura = 10;
        mapa.largura = 15;
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);
        Inimigo maiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println("Lista 3: exercício 1");
        System.out.println(maiorAtaque.nome);
    }
}