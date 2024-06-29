package com.poo.classes;

public class editora {
    String editora;
    String livro;
    String edicao;
    int ano;
    String autor;
    public editora(String livro, String edicao, int ano , String autor ){
        this.livro = livro;
        this.edicao = edicao;
        this.ano = ano;
        this.autor = autor;

    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(){
        this.editora = editora;
    }
    public String getlivro(){
        return livro;
    }
    public void setlivro(){

        this.livro = livro;
    }
    public String getedicao(){
        return edicao;
    }
    public void setedicao(){
        this.edicao = edicao;
    }
    public int getano(){
        return ano;
    }
    public void setano(){
        this.ano = ano;
    }
    public String getautor(){
        return autor;
    }
    public void setautor(){
        this.autor = autor;
    }
}
