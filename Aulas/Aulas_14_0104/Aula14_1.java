import java.util.Scanner;
public class Main
{
    static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.ln);
        System.out.println("Digite o nome de usuário:");
        String nomeDeUsuario = leitor.nextLine();
        System.out.println("Digite a senha:");
        String senha = leitor.nextLine();
        if(nomeDeUsuario.equals("admin") && senha.equals("123"))
        {
            System.out.println("Login realizado com sucesso");
        }
        else
        {
            System.out.println("Nome de usuário ou senha inválidos");
        }
    }
}