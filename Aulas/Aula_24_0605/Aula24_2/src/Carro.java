public class Carro implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Carro está acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Carro está freando");
    }
    @Override
    public void virarEsquerda(){
        System.out.println("Carro está virando à esquerda");
    }
    @Override
    public void virarDireita(){
        System.out.println("Carro está virando à direita");
    }
}
