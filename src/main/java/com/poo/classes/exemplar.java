package com.poo.classes;

public class exemplar {
    private int exemplarID;
    private int exemplarEmprestimo;
    private static int contador = 0;
    
    public exemplar(int exemplarID) {
        this.exemplarID = exemplarID;
    }
    public int getExemplarID() {
        return exemplarID;
    }
    public void setExemplarID(int exemplarID) {
        this.exemplarID = exemplarID;
    }
    public int getExemplarEmprestimo() {
        return exemplarEmprestimo;
    }
    public void setExemplarEmprestimo(int exemplarEmprestimo) {
        this.exemplarEmprestimo = exemplarEmprestimo;
    }

    
}
