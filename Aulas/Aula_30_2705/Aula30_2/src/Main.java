import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("azul", "No espectro solar, a cor que se situa entre o verde e o violeta");
        dicionario.put("fórmula", "Expressão concisa e rigorosa, constituída em geral de símbolos, que resume um certo número de dados");

        if (dicionario.containsKey("azul")){
            System.out.println(dicionario.get("azul"));
        }

        Map<String, Boolean> quests = new HashMap<>();
        quests.put("encontrar 10 moedas de ouro", false);
        quests.put("derrote 3 inimigos", false);

        if (quests.containsKey("derrote 3 inimigos")){
            quests.replace("derrote 3 inimigos", true);
            System.out.println(quests.get("derrote 3 inimigos"));
        }
    }
}