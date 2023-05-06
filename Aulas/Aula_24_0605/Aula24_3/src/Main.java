public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.adicionarMusico(new Guitarrista());
        banda.adicionarMusico(new Tecladista());
        banda.adicionarMusico(new Baterista());
        banda.realizarSolos();
    }
}