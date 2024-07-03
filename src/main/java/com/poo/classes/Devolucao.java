package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {

    int devolucaoId;
    LocalDate dataDevolucao = LocalDate.now();
    
    public Devolucao(int devolucaoId) {
        this.devolucaoId = devolucaoId;
    }
    public int getDevolucaoId() {
        return devolucaoId;
    }
    public void setDevolucaoId(int devolucaoId) {
        this.devolucaoId = devolucaoId;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    

}
