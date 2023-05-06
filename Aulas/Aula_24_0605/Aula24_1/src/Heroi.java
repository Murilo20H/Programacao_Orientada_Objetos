import java.util.ArrayList;

public class Heroi {
    private int id;
    private String nome;
    private ArrayList<Arma> armas;

    public Heroi() {}

    public Heroi(int id, String nome, Arma arma) {
        this.id = id;
        this.nome = nome;
        this.armas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
