package br.com.feiradeprojetos.classes.Usuarios;

import br.com.feiradeprojetos.classes.Equipe;

public class Aluno extends Usuario{

    public Equipe equipeAluno;

    public Aluno(String nome, String nomeUsuario, String email, String senha) {
        super(nome, nomeUsuario, email, senha);
    }

    public void criarEquipe(String nomeEquipe) {
        if (this.equipeAluno == null) {
            this.equipeAluno = new Equipe(nomeEquipe);
        }
    }
}
