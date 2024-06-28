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
}
