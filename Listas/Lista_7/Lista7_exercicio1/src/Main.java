public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        fabrica.adicionarOperario(new OperadorDeCorte());
        fabrica.adicionarOperario(new OperadorDeDobra());
        fabrica.adicionarOperario(new OperadorDePrensa());
        System.out.println("Lista 7: exercício 1");
        fabrica.realizarTrabalho();
    }
}