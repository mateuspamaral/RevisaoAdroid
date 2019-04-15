package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    //Attributes
    private String nome;
    private List<Aula> aulas;
    private List<Aluno> alunos;
    private Professor professor;

    //Constructors
    public Curso(String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor) {
        this.nome = nome;
        this.aulas = aulas;
        this.alunos = alunos;
        this.professor = professor;
    }

    public Curso(){

    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //Methods
}
