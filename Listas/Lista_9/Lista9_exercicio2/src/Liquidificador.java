public class Liquidificador <T>{
    private T alimento;
    public void bater(Alimento alimento){
        System.out.println("O alimento foi batido no liquidificador!");
    }

    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }
}
