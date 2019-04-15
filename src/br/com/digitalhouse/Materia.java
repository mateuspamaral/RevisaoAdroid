package br.com.digitalhouse;

public class Materia {
    //Attributes
    private String nome;

    //Constructors
    public Materia(String nome) {
        this.nome = nome;
    }

    public Materia(){

    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
