package br.com.digitalhouse;
import java.util.ArrayList;

public class Professor implements Docente {
    //Attributes
    private String nome;
    private Integer registroDocente;

    //Constructors
    public Professor(String nome, Integer registroDocente) {
        this.nome = nome;
        this.registroDocente = registroDocente;
    }

    public Professor(){

    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRegistroDocente() {
        return registroDocente;
    }

    public void setRegistroDocente(Integer registroDocente) {
        this.registroDocente = registroDocente;
    }

    //Methods
    @Override
    public void darAulas(ArrayList<Aula> aulas) {
        System.out.println("Aulas de hoje:");
        for (Aula aula : aulas){
            System.out.println(aula.getMateria().getNome());
        }
    }

    @Override
    public void fazerChamada(ArrayList<Aluno> alunos) {
        System.out.println("Olha a chamada aewwww");
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
    }
}
