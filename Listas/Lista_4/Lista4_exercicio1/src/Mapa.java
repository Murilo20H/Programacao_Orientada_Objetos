import java.util.ArrayList;
public class Mapa
{
    private String nome;
    private int altura;
    private int largura;
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> herois = new ArrayList<>();
    public Inimigo getInimigoMaiorAtaque()
    {
        int maiorAtaque = 0;
        int index = 0;
        for (int contador = 0; contador < inimigos.size(); contador++)
        {
            if(inimigos.get(contador).getAtaque() > maiorAtaque)
            {
                maiorAtaque = inimigos.get(contador).getAtaque();
                index = contador;
            }
        }
        return inimigos.get(index);
    }
    public Mapa()
    {

    }
    public Mapa(String nome, int altura, int largura)
    {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
    }

    public String getNome()
    {
        return  this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getAltura()
    {
        return  this.altura;
    }
    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    public int getLargura()
    {
        return  this.largura;
    }
    public void setLargura(int largura)
    {
        this.largura = largura;
    }
}
