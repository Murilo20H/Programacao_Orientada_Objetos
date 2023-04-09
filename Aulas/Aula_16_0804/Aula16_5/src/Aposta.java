import java.util.Scanner;
public class Aposta
{
    public void apostar()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você deseja apostar: ");
        String vaiApostar = leitor.nextLine();
        if(vaiApostar.equals("sim"))
        {
            System.out.println("Você deseja apostar em qual lutador: Jorge ou Jorgeson");
            String apostouNo = leitor.nextLine();
            if(apostouNo.equals("Jorge"))
            {
                System.out.println("Você deseja apostar quanto no Jorge: R$");
                int quantiaApostada = leitor.nextInt();
                System.out.println("Você apostou " + quantiaApostada + " reais no Jorge.");
            }
            else if (apostouNo.equals("Jorgeson"))
            {
                System.out.println("Você deseja apostar quanto no Jorgeson: R$");
                int quantiaApostada = leitor.nextInt();
                System.out.println("Você apostou " + quantiaApostada + " reais no Jorgeson.");
            }
        }
        else if(vaiApostar.equals("Sim"))
        {
            System.out.println("Você deseja apostar em qual lutador: Jorge ou Jorgeson");
            String apostouNo = leitor.nextLine();
            if(apostouNo.equals("Jorge"))
            {
                System.out.println("Você deseja apostar quanto no Jorge: R$");
                int quantiaApostada = leitor.nextInt();
                System.out.println("Você apostou " + quantiaApostada + " reais no Jorge.");
            }
            else if (apostouNo.equals("Jorgeson"))
            {
                System.out.println("Você deseja apostar quanto no Jorgeson: R$");
                int quantiaApostada = leitor.nextInt();
                System.out.println("Você apostou " + quantiaApostada + " reais no Jorgeson.");
            }
        }
    }
}
