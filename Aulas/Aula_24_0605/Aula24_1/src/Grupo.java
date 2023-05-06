import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        this.herois.add(heroi);
    }
    public void removerHeroi(int idHeroi){
        for (int i = 0; i < this.herois.size(); i++) {
            if (this.herois.get(i).getId() == idHeroi){
                this.herois.remove(i);
            }
        }
    }
    public ArrayList<Heroi> getHerois(){
        return this.herois;
    }
}
