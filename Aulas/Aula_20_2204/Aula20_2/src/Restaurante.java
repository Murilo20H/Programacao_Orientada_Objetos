import java.util.ArrayList;
public class Restaurante {
    private ArrayList<Prato> cardapio;
    public Restaurante()
    {
        cardapio = new ArrayList<>();
        cardapio.add(new Prato(1, "Feijoada", 45.00));
        cardapio.add(new Prato(2, "Baião de Dois", 32.00));
        cardapio.add(new Prato(3, "Stron", 42.00));
    }
    public static String retornarPratosNoCardapio()
    {
        StringBuilder pratos = new StringBuilder();
        for(int i = 0; i < pratos.size(); i++)
        {
            pratos.append(i+1).append(". ").append(cardapio.get(i).getNome()).append(". ").append(cardapio.get(i).getPreco()).append("R$\n");
        }
        return pratos.toString();
    }
}
