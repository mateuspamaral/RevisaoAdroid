package br.com.digitalhouse;

import java.util.ArrayList;

public class Aluno {
    //Attributes
    private Integer registroAcademico;
    private String nome;
    private String sobrenome;

    //Constructors
    public Aluno(Integer registroAcademico, String nome, String sobrenome) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno () {

    }

    //Getters & Setters
    public Integer getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(Integer registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Methods
    public void assistirAulas(ArrayList<Aula> aulas){
        System.out.println(this.registroAcademico + " - " + this.nome + " " + this.sobrenome +
                            "\nAs matérias de hoje são:");
        for (Aula aula : aulas ){
            System.out.println(aula.getMateria().getNome() + " De: " + aula.getHoraInicio() + " Até: " + aula.getHoraTermino());
        }
    }

    public void fazerLicoes(ArrayList<String> licoes){
        System.out.println("Lições feitas:");
        for (String licao : licoes){
            System.out.println(licao);
        }
    }
}
