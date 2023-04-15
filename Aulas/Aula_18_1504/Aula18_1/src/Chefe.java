public class Chefe
{
    int medalha;
    String drop;
    int nivel;
    int pontosDeVida;
    int pontosDeForca;
    int pontosDeDefesa;
    public Chefe(String drop, int nivel, int pontosDeVida, int pontosDeForca, int pontosDeDefesa, int medalha)
    {
        this.drop = drop;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeForca = pontosDeForca;
        this.pontosDeDefesa = pontosDeDefesa;
        this.medalha = medalha;
    }
}