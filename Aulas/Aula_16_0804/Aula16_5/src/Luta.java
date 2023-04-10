import java.util.Random;
public class Luta
{
    String nome;
    Lutador lutador1 = new Lutador();
    String categoria;
    Lutador lutador2 = new Lutador();
    public void lutar()
    {
        System.out.println("Hoje na categoria " + categoria);
        System.out.println("De um lado temos o: " + lutador1.nome + ", pesando " + lutador1.peso + "kg.");
        System.out.println("E do outro lado temos o: " + lutador2.nome + ", pesando " + lutador2.peso + "kg.");
    }
    Random sorteio = new Random();
    int ganhador = sorteio.nextInt(2);
    if(ganhador == 1)
    {
        int Jogadorganhador = 1;
    }
    else if(ganhador == 2)
    {
        int Jogadorganhador = 2;
    }
}
