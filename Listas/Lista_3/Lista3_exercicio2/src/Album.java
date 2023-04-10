import java.util.ArrayList;
public class Album
{
    String nome;
    String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();
    public Musica getMusicaMaiorPopularidade()
    {
        int maiorPopularidade = 0;
        int index = 0;
        for (int contador = 0; contador < musicas.size(); contador++)
        {
            if(musicas.get(contador).popularidade > maiorPopularidade)
            {
                maiorPopularidade = musicas.get(contador).popularidade;
                index = contador;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorDuracao()
    {
        int menorDuracao = 6000;
        int index = 0;
        for (int contador = 0; contador < musicas.size(); contador++)
        {
            if(musicas.get(contador).duracaoEmSegundos < menorDuracao)
            {
                menorDuracao = musicas.get(contador).duracaoEmSegundos;
                index = contador;
            }
        }
        return musicas.get(index);
    }
}
