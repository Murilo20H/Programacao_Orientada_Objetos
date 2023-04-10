import java.util.ArrayList;
public class Mapa
{
    String nome;
    int altura;
    int largura;
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> herois = new ArrayList<>();
    public Inimigo getInimigoMaiorAtaque()
    {
        int maiorAtaque = 0;
        int index = 0;
        for (int contador = 0; contador < inimigos.size(); contador++)
        {
            if(inimigos.get(contador).ataque > maiorAtaque)
            {
                maiorAtaque = inimigos.get(contador).ataque;
                index = contador;
            }
        }
        return inimigos.get(index);
    }
}
