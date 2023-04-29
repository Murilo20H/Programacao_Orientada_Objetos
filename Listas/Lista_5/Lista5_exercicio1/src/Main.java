public class Main {

    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "Jorge", 30));
        grupo.adicionarHeroi(new Heroi(2, "Pablo", 60));
        grupo.adicionarHeroi(new Heroi(3, "Jorgeson", 20));
        grupo.adicionarHeroi(new Heroi(3, "Jorgeson", 20));
        grupo.removerHeroi(1);
        System.out.println("O total de moedas de ouro do grupo é: " + grupo.getTotalMoedasDeOuro());
    }
}
