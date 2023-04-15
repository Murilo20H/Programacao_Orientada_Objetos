public class Conta
{
    private int dinheiro;
    private String senha;

    public void setSenha(String senha)
    {
        if(senha.isBlank() || senha.length() < 6)
        {
            System.out.println("Senha inválida");
            return;
        }
        this.senha = senha;
    }

    public String getSenha()
    {
        return  this.senha;
    }

    public int getDinheiro()
    {
        return  this.dinheiro;
    }
}
