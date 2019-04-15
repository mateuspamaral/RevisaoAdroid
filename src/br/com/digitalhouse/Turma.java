package br.com.digitalhouse;

public class Turma {
    //Attributes
    private String nome;
    private Curso curso;

    //Constructors
    public Turma(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Turma(){

    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //Methods
}
