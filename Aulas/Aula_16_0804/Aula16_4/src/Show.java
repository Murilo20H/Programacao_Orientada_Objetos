import java.util.ArrayList;
public class Show
{
    String data;
    int id;
    Artista artista = new Artista();
    String nome;
    public void apresentar() throws InterruptedException
    {
        System.out.println("Com vocês, o grande: " + artista.nome + "!\n");
        artista.cantar();
    }
}
