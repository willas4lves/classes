package com.poo.classes;

import java.util.Date;
import java.util.List;

public class bibliotecateste {


class Editora {
    private int editoraId;
    private String nome;


    public Editora(int editoraId, String nome) {
        this.editoraId = editoraId;
        this.nome = nome;
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


class Livro {
    private int livroId;
    private String edicao;
    private String titulo;
    private int ano;
    private Autor autor;
    private Editora editora;


}


class Autor {
    private int autorId;
    private String nome;

    // Construtor, getters e setters
}

//  Pessoa
class Pessoa {
    private int pessoaId;
    private String rg;
    private String cpf;
    private String nome;
    private Endereco endereco;

    // Construtor, getters e setters
}

// Classe Endereco
class Endereco {
    private int enderecoId;
    private String uf;
    private String cidade;
    private String tipo;
    private String logradouro;
    private String complemento;

    // Construtor, getters e setters
}

// Classe Exemplar
class Exemplar {
    private int exemplarId;
    private Livro livro;

    // Construtor, getters e setters
    
}

// Classe Emprestimo
class Emprestimo {
    private int emprestimoId;
    private Date dataEmprestimo;
    private Date dataPrevDev;
    private Pessoa pessoa;
    private List<ExemplarEmprestimo> exemplaresEmprestimo;

    // Construtor, getters e setters
}

// Classe ExemplarEmprestimo
class ExemplarEmprestimo {
    private int exemplarEmprestimoId;
    private Exemplar exemplar;
    private Emprestimo emprestimo;
    private Devolucao devolucao;

    // Construtor, getters e setters
}

// Classe Devolucao
class Devolucao {
    private int devolucaoId;
    private Date dataDevolvido;

    // Construtor, getters e setters
}


}
