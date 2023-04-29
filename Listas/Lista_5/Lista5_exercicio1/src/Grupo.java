import java.io.PrintStream;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro = 0;

    public void adicionarHeroi(Heroi heroi) {
        for(int i = 0; i < this.herois.size(); ++i) {
            if (herois.get(i).getId() == heroi.getId()) {
                System.out.println("O herói já está no grupo, insira outro ID!");
                return;
            }
        }

        this.totalMoedasDeOuro += heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("O herói: " + heroi.getNome() + " foi adicionado ao grupo!");
        this.herois.add(heroi);
    }

    public void removerHeroi(int idHeroi) {
        for (int i = 0; i < herois.size(); i++)
        {
            if (herois.get(i).getId() == idHeroi)
            {
                this.totalMoedasDeOuro -= herois.get(i).getQuantidadeDeMoedasDeOuro();
                System.out.println("O herói: " + herois.get(i).getNome() + " foi removido do grupo!");
                herois.remove(i);
            }
        }
    }

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public ArrayList<Heroi> getHerois() {
        return this.herois;
    }

    public int getTotalMoedasDeOuro() {
        return this.totalMoedasDeOuro;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}
