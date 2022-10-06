package br.com.feiradeprojetos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AssociacaoEquipeUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idAluno")
    private Integer idAluno;
    
    @Column(name = "idEquipe")
    private Integer idEquipe;

    public AssociacaoEquipeUsuario() {
    }

    public AssociacaoEquipeUsuario(Integer idAluno, Integer idEquipe) {
        this.idAluno = idAluno;
        this.idEquipe = idEquipe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idAluno;
    }

    public void setIdUsuario(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AssociacaoEquipeUsuario other = (AssociacaoEquipeUsuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AssociacaoEquipeUsuario [id=" + id + ", idAluno=" + idAluno + ", idEquipe=" + idEquipe + "]";
    }
}
