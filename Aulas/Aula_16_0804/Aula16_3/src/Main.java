public class Main {
    public static void main(String[] args)
    {
        Estudante[] estudantes = new Estudante[10];
        for (int i = 0; i < estudantes.length; i++)
        {
            estudantes[i] = new Estudante();
        }
        estudantes[0].nomeCompleto = "Jorge da Silva";
        System.out.println(estudantes[0].nomeCompleto);
    }
}