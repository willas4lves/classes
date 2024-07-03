package com.poo.classes;

public class Editora_atividade {
    private int editoraId;
    private String nome;
    private static int contador = 0;

    public Editora_atividade(String nome) {
        this.nome = nome;
        editoraId = contador;
        contador++;
        
    }
    public int getEditoraId() {
        return editoraId;
    }
    public void setEditoraId(int editoraId) {
        this.editoraId = editoraId;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
