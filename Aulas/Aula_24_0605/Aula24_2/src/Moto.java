public class Moto implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Moto está acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Moto está freando");
    }
    @Override
    public void virarEsquerda(){
        System.out.println("Moto está virando à esquerda");
    }
    @Override
    public void virarDireita(){
        System.out.println("Moto está virando à direita");
    }
}
