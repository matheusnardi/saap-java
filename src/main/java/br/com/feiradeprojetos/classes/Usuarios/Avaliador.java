package br.com.feiradeprojetos.classes.Usuarios;

import br.com.feiradeprojetos.classes.Projeto;

public class Avaliador extends Usuario{

    public Avaliador(String nome, String nomeUsuario, String email, String senha) {
        super(nome, nomeUsuario, email, senha);
    }

    public void avaliarProjeto(Projeto projeto, Float nota){
        System.out.println("\nProjeto avaliado!");
        System.out.println("Nota: "+nota);
    }
    
}
