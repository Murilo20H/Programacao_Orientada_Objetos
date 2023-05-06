public class Onibus implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Ônibus está acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Ônibus está freando");
    }
    @Override
    public void virarEsquerda(){
        System.out.println("Ônibus está virando à esquerda");
    }
    @Override
    public void virarDireita(){
        System.out.println("Ônibus está virando à direita");
    }
}
