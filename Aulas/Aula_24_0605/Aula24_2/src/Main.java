public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        corrida.adicionarVeiculo(new Carro());
        corrida.adicionarVeiculo(new Caminhao());
        corrida.adicionarVeiculo(new Moto());
        corrida.adicionarVeiculo(new Onibus());
        corrida.iniciarCorrida();
    }
}