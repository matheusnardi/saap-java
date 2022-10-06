package br.com.feiradeprojetos.models.entities.Usuarios;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.feiradeprojetos.models.entities.AssociacaoEquipeUsuario;

@Entity
public class Aluno extends Usuario{
    @OneToMany(cascade = CascadeType.ALL, targetEntity = AssociacaoEquipeUsuario.class)
    @JoinColumn(name = "idAluno")
    private List<AssociacaoEquipeUsuario> equipesUsuario;

    public Aluno() {
    }

    public Aluno(String nome, String nomeUsuario, String email, String senha) {
        super(nome, nomeUsuario, email, senha);
    }
}
