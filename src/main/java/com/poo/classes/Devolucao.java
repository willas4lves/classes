package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {

    int devolucaoId;
    LocalDate dataDevolucao = LocalDate.now();

    public int getdevolucaoId(){
        return devolucaoId;
    }

    public LocalDate getdatadevolucao(){
        return dataDevolucao;
    }

    public void setdevolucaoId(){
    }

    public void setdatadevolucao(){
        
    }

}
