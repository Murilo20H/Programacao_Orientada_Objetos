public class Main {
    public static void main(String[] args)
    {
        Musica musica1 = new Musica("La", 191, 188000, "Pop");
        Musica musica2 = new Musica("Sad Songs In A Hotel Room", 191, 765000, "Pop");
        Musica musica3 = new Musica("Used To It", 194, 265000, "Pop");
        Musica musica4 = new Musica("Lifeline", 230, 1400000, "Pop");
        Musica musica5 = new Musica("Smoke Slow", 217, 2100000, "Pop");
        Musica musica6 = new Musica("All In Due Time", 139, 181000, "Pop");
        Album album1 = new Album("Sad Songs In A Hotel Room", "Joshua Bassett");
        album1.musicas.add(musica1);
        album1.musicas.add(musica2);
        album1.musicas.add(musica3);
        album1.musicas.add(musica4);
        album1.musicas.add(musica5);
        album1.musicas.add(musica6);
        Musica musicaMaiorPopularidade = album1.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album1.getMusicaMenorDuracao();
        System.out.println("Lista 3: exercício 2");
        System.out.println("Álbum: " + album1.getNome() + " do(a) " + album1.getNomeArtista());
        System.out.println("Música mais popular: " + musicaMaiorPopularidade.getNome());
        System.out.println("Música com menor duração: " + musicaMenorDuracao.getNome());
    }
}