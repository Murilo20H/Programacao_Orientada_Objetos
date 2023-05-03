public abstract class Veiculo {
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected int precisaoEmCurvas;
    protected boolean estaComFarolLigado;
    public Veiculo(){}
    public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas)
    {
        this.id = id;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }
    public void acelerar()
    {
        velocidadeAtual = velocidadeMaxima;
    }
    public void desacelerar()
    {
        velocidadeAtual = 0;
    }
    public void ligarFarol()
    {
        estaComFarolLigado = true;
    }
    public void utiliarHabilidadeEspecial(){
        System.out.println("O veículo usou a habilidade especial.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPrecisaoEmCurvas() {
        return precisaoEmCurvas;
    }

    public void setPrecisaoEmCurvas(int precisaoEmCurvas) {
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public boolean isEstaComFarolLigado() {
        return estaComFarolLigado;
    }

    public void setEstaComFarolLigado(boolean estaComFarolLigado) {
        this.estaComFarolLigado = estaComFarolLigado;
    }
}
