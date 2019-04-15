package br.com.digitalhouse;

import java.util.ArrayList;

public interface Docente {
    //Methods
    void darAulas(ArrayList<Aula> aulas);
    void fazerChamada(ArrayList<String> licoes);
}
