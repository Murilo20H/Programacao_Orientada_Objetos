package com.programando.aula371;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private int id;
    private String nome;
    private List<String> tipo = new ArrayList<>();;

    public Pokemon() {}

    public Pokemon(int id, String nome, List<String> tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }
}
