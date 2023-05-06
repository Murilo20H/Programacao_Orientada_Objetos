import java.util.ArrayList;
import java.util.List;

public class Banda {
    private List<Musico> musicos;
    public Banda(){
        this.musicos = new ArrayList<>();
    }
    public void adicionarMusico(Musico musico){
        this.musicos.add(musico);
    }
    public void realizarSolos(){
        for (Musico musico : musicos){
            musico.tocar();
        }
    }
}
