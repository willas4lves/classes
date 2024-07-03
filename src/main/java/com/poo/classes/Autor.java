package com.poo.classes;

public class Autor {

    private static int contadorId = 1;
    private int autorId;
    private String nome;

    public Autor(String nome) {
        this.autorId = contadorId++;
        this.nome = nome;
    }


    public int getAutorId() {
        return autorId;
    }

    public String getnome(){
        return nome;
    }

    public void setautorId(){
        this.autorId = autorId;
    }

    public void setnome(){
        this.nome = nome;
    }

}
