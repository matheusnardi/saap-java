package br.com.feiradeprojetos.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.feiradeprojetos.models.entities.AssociacaoUsuarioEquipe;

@Repository
public interface AssociacaoUsuarioEquipeRepository extends JpaRepository<AssociacaoUsuarioEquipe, Integer>{
    
}
