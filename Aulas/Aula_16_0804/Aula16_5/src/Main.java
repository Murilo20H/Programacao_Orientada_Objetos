public class Main {
    public static void main(String[] args)
    {
        Luta luta = new Luta();
        luta.nome = "World Wrestling Entertainment";
        luta.lutador1.nome = "Jorge";
        luta.lutador2.nome = "Jorgeson";
        luta.lutador1.peso = 42;
        luta.lutador2.peso = 900;
        luta.categoria = "peso pesado";
        luta.lutar();
        Aposta aposta = new Aposta();
        aposta.apostar();
    }
}