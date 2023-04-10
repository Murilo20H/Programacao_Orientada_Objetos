public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Show show = new Show();
        show.nome = "Meu show";
        show.artista = new Artista();
        show.artista.nome = "Revelação";
        show.apresentar();
    }
}