public class Caminhao implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Caminhão está acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Caminhão está freando");
    }
    @Override
    public void virarEsquerda(){
        System.out.println("Caminhão está virando à esquerda");
    }
    @Override
    public void virarDireita(){
        System.out.println("Caminhão está virando à direita");
    }
}
