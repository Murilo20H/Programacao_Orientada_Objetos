public class Main {
    public static void main(String[] args)
    {
        Musica musica1 = new Musica();
        musica1.duracaoEmSegundos = 191;
        musica1.nome = "LA";
        musica1.genero = "Pop";
        musica1.popularidade = 188000;
        Musica musica2 = new Musica();
        musica2.duracaoEmSegundos = 191;
        musica2.nome = "Sad Songs In A Hotel Room";
        musica2.genero = "Pop";
        musica2.popularidade = 765000;
        Musica musica3 = new Musica();
        musica3.duracaoEmSegundos = 194;
        musica3.nome = "Used To It";
        musica3.genero = "Pop";
        musica3.popularidade = 265000;
        Musica musica4 = new Musica();
        musica4.duracaoEmSegundos = 230;
        musica4.nome = "Lifeline";
        musica4.genero = "Pop";
        musica4.popularidade = 1400000;
        Musica musica5 = new Musica();
        musica5.duracaoEmSegundos = 217;
        musica5.nome = "Smoke Slow";
        musica5.genero = "Pop";
        musica5.popularidade = 2100000;
        Musica musica6 = new Musica();
        musica6.duracaoEmSegundos = 139;
        musica6.nome = "All In Due Time";
        musica6.genero = "Pop";
        musica6.popularidade = 181000;
        Album album1 = new Album();
        album1.nomeArtista = "Joshua Bassett";
        album1.nome = "Sad Songs In A Hotel Room";
        album1.musicas.add(musica1);
        album1.musicas.add(musica2);
        album1.musicas.add(musica3);
        album1.musicas.add(musica4);
        album1.musicas.add(musica5);
        album1.musicas.add(musica6);
        Musica musicaMaiorPopularidade = album1.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album1.getMusicaMenorDuracao();
        System.out.println("Lista 3: exercício 2");
        System.out.println("Álbum: " + album1.nome + " do(a) " + album1.nomeArtista);
        System.out.println("Música mais popular: " + musicaMaiorPopularidade.nome);
        System.out.println("Música com menor duração: " + musicaMenorDuracao.nome);
    }
}