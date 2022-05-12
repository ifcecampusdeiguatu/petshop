package com.br.petshop.src.petshop.model;

public class Veterinario {
    private int id;
    private String nome;
    private String raca;
    private String especie;

    // Construtor especial
    public Animal(String nome, String raca, String especie) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
    }

    // Construtor padrão
    public Animal() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
