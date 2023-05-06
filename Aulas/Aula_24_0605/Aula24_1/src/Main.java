public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "Jorge", new Arma(10, "besta")));
        grupo.adicionarHeroi(new Heroi(2, "Jorgesson", new Arma(15, "espada")));
        grupo.adicionarHeroi(new Heroi(3, "Lyn", new Arma(7, "faca")));

        System.out.println("O heroi " + grupo.getHerois().get(1).getNome() + " foi adicionado ao grupo!");
    }
}