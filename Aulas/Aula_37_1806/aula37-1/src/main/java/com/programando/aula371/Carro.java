package com.programando.aula371;

public class Carro {
    private String modelo;
    private int anoLancamento;


    public Carro() {}

    public Carro(String modelo, int anoLancamento) {
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
