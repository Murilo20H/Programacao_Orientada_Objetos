import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> alunosProgamando = new ArrayList<>();
        alunosProgamando.add( "Murilo");
        alunosProgamando.add("Clara");
        alunosProgamando.add( "Ryan");
        alunosProgamando.add( "Monica");

        List<String> alunosPreVestibular = new ArrayList<>();
        alunosProgamando.add("Murilo");
        alunosProgamando.add("Clara");
        alunosProgamando.add("Eduardo");
        alunosProgamando.add("Rayanne");

        Set<String> alunosIFSP = new HashSet<>();

        for(String nome : alunosProgamando){
            alunosIFSP.add(nome);
        }

        for(String nome : alunosPreVestibular){
            alunosIFSP.add(nome);
        }

        for(String nome : alunosIFSP){
            System.out.println(nome);
        }
    }
}