package com.holidayzer.api.classes;

public class Holiday {
    private String data;
    private String nome;

    public Holiday(String data, String nome) {
        this.data = data;
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}
