package br.com.feiradeprojetos.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.feiradeprojetos.models.entities.AssociacaoEquipeUsuario;

public interface AssociacaoEquipeUsuarioRepository extends JpaRepository<AssociacaoEquipeUsuario, Integer>{
    List<AssociacaoEquipeUsuario> findAllByIdUsuario(Integer idUsuario);

    List<AssociacaoEquipeUsuario> findAllByIdEquipe(Integer idEquipe);
}
