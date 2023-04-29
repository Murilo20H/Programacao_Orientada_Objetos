public abstract class Inimigo {
    protected int id;
    protected int dano;
    protected int vida;
    protected int defesa;

    public Inimigo(int id, int dano, int vida, int defesa) {
        this.id = id;
        this.dano = dano;
        this.vida = vida;
        this.defesa = defesa;
    }

    public void atacar() {
        System.out.println("O inimigo atacou e causou " + dano + " de dano.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
