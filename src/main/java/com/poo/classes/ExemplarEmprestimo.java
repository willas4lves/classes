package com.poo.classes;

import com.poo.classes.bibliotecateste.Exemplar;

public class ExemplarEmprestimo {

    private static int contadorExemplarEmprestimo = 0;
    private int exemplarEmprestimoID;
    private Exemplar exemplar;
    private Emprestimo emprestimo;
    private Devolucao devolucao;

    ExemplarEmprestimo() {
        exemplarEmprestimoID = contadorExemplarEmprestimo;
        contadorExemplarEmprestimo++;
    }

    public static int getContadorExemplarEmprestimo() {
        return contadorExemplarEmprestimo;
    }
    public static void setContadorExemplarEmprestimo(int contadorExemplarEmprestimo) {
        ExemplarEmprestimo.contadorExemplarEmprestimo = contadorExemplarEmprestimo;
    }
    public int getExemplarEmprestimoID() {
        return exemplarEmprestimoID;
    }
    public void setExemplarEmprestimoID(int exemplarEmprestimoID) {
        this.exemplarEmprestimoID = exemplarEmprestimoID;
    }
    public Exemplar getExemplar() {
        return exemplar;
    }
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    public Devolucao getDevolucao() {
        return devolucao;
    }
    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
    
    

    

}
