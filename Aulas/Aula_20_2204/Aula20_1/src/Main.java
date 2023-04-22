import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Oi");
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        JOptionPane.showMessageDialog(null, "Oi " + nome);
    }
}