package br.com.feiradeprojetos.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.feiradeprojetos.models.entities.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{
    
}
