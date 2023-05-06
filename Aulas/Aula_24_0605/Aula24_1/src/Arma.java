public class Arma {
    private String nome;
    private int pontosDano;

    public Arma() {}

    public Arma(int pontosDano, String nome) {
        this.pontosDano = pontosDano;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPontosDano() {
        return pontosDano;
    }

    public void setPontosDano(int pontosDano) {
        this.pontosDano = pontosDano;
    }
}
