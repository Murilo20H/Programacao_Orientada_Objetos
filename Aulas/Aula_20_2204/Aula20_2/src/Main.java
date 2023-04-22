import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Bem vindo(a) ao nosso restaurante, digite seu nome");
        Cliente cliente = new Cliente(1, "Jorge");

        JOptionPane.showMessageDialog(null, "Oi " + cliente.getNome());
    }
}