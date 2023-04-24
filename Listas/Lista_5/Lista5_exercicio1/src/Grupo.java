import java.util.ArrayList;
public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro = 0;

    public void adicionarHeroi(Heroi heroi)
    {
        for (int i = 1; i < herois.size(); i++)
        {
            if (herois.get(i).getId() == heroi.getId())
            {
                System.out.println("O herói já está no grupo, insira outro ID!");
                return;
            }
        }
        totalMoedasDeOuro = totalMoedasDeOuro + heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("O herói: " + heroi.getNome() + " foi adicionado ao grupo!");
        this.herois.add(heroi);
        return;
    }

    public void removerHeroi(int idHeroi)
    {
        totalMoedasDeOuro = totalMoedasDeOuro - (herois.get(idHeroi).getQuantidadeDeMoedasDeOuro()/2);
        System.out.println("O herói: " + herois.get(idHeroi).getNome() + " foi removido do grupo!");
    }
    public Grupo()
    {
        this.herois = new ArrayList<>();
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}
