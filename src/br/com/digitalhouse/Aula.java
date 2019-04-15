package br.com.digitalhouse;

public class Aula {
    //Attributes
    private Integer horaInicio;
    private Integer horaTermino;
    private Materia materia;

    //Constructors
    public Aula(Integer horaInicio, Integer horaTermino, Materia materia) {
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.materia = materia;
    }

    public Aula(){

    }

    //Getters & Setters
    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Integer getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(Integer horaTermino) {
        this.horaTermino = horaTermino;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    //Methods
}
