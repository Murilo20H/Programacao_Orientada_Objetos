public class Main{

        public static void main(String[] args)
        {
            Heroi jorge = new Heroi("Mago", 1, 15, 7, 6);
            Heroi jailson = new Heroi("Cavalheiro", 1, 8, 4, 6);
            Heroi cleide = new Heroi("Suporte", 1, 12, 2, 8);
            Monstro minotauro = new Monstro("chifre de minotauro", 3, 20, 7, 2);
            Monstro medusa = new Monstro("cabeça da medusa", 2, 8, 8, 2);
            Monstro tigre = new Monstro("couro", 1, 10, 7, 1);
            Chefe hidra = new Chefe("dente de hidra", 10, 25, 14, 8, 1);
            Arma espadaPequena = new Arma("corpo a corpo", 2, 1, 5);
            Arma espadaMedia = new Arma("corpo a corpo", 3, 1, 10);
            Arma adagas = new Arma("corpo a corpo", 1, 1, 3);
            Arma besta = new Arma("corpo a corpo", 3, 5, 10);
            Masmorra masmorraInicial = new Masmorra(5, 1);
            jorge.armas.add(besta);
        }
}