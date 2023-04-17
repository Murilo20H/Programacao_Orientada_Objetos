import java.util.ArrayList;
public class Album
{
    private String nome;
    private String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();
    public Musica getMusicaMaiorPopularidade()
    {
        int maiorPopularidade = 0;
        int index = 0;
        for (int contador = 0; contador < musicas.size(); contador++)
        {
            if(musicas.get(contador).getPopularidade() > maiorPopularidade)
            {
                maiorPopularidade = musicas.get(contador).getPopularidade();
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
            if(musicas.get(contador).getDuracaoEmSegundos() < menorDuracao)
            {
                menorDuracao = musicas.get(contador).getDuracaoEmSegundos();
                index = contador;
            }
        }
        return musicas.get(index);
    }
    public Album()
    {

    }
    public Album(String nome, String nomeArtista)
    {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }

    public String getNome()
    {
        return  this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNomeArtista()
    {
        return  this.nomeArtista;
    }
    public void setNomeArtista(String nomeArtista)
    {
        this.nomeArtista = nomeArtista;
    }
}
