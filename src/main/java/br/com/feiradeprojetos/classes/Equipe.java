package br.com.feiradeprojetos.classes;

public class Equipe {

    private String nome;

    public Projeto projetoEquipe;

    public Equipe() {
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarProjeto(String nomeProjeto) {
        if (this.projetoEquipe == null) {
            this.projetoEquipe = new Projeto(nomeProjeto);
        }
    }
}
