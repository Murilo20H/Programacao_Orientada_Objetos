import java.util.ArrayList;
public class Heroi
{
    String categoria;
    int nivel;
    int pontosDeVida;
    int pontosDeForca;
    int pontosDeDefesa;
    ArrayList<Arma> armas = new ArrayList<>();
    public Heroi(String categora, int nivel, int pontosDeVida, int pontosDeForca, int pontosDeDefesa)
    {
        this.categoria = categora;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeForca = pontosDeForca;
        this.pontosDeDefesa = pontosDeDefesa;
    }
}
