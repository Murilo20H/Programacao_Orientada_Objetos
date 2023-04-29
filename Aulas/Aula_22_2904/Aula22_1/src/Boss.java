import java.util.Random;

public class Boss extends Inimigo{
    public Boss(int id, int dano, int vida, int defesa)
    {
        super(id, dano, vida, defesa);
    }
    public void atacar(){
        Random random = new Random();
        int numeroSorteado = random.nextInt(10);
        if(numeroSorteado < 4){
            System.out.println("O Boss atacou e causou " + dano + " de dano!");
        } else if(numeroSorteado <=6){
            System.out.println("Boss usou um ataque especial!");
            System.out.println("O Boss atacou e causou " + dano * 2 + " de dano!");
        } else {
            System.out.println("O BOSS USOU UM ATAQUE ULTRA ESPECIAL!!!");
            System.out.println("O Boss atacou e causou " + dano * 3 + " de dano!");
        }
    }
}
