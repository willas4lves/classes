package com.poo.classes;

public class Emprestimo {
    int emprestimoId;
    String dataEmprestimo;
    String dataPrevDev;
    private static int contador = 0;
    
    public Emprestimo() {
        this.emprestimoId = contador;
        contador++;
    }
    public int getEmprestimoId() {
        return emprestimoId;
    }
    public void setEmprestimoId(int emprestimoId) {
        this.emprestimoId = emprestimoId;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDataPrevDev() {
        return dataPrevDev;
    }
    public void setDataPrevDev(String dataPrevDev) {
        this.dataPrevDev = dataPrevDev;
    }

    
}
