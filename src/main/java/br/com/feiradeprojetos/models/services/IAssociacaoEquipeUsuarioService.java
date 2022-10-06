package br.com.feiradeprojetos.models.services;

import java.util.List;
import java.util.Optional;

import br.com.feiradeprojetos.models.entities.AssociacaoEquipeUsuario;

public interface IAssociacaoEquipeUsuarioService {
    List<AssociacaoEquipeUsuario> buscarTodos();

    List<AssociacaoEquipeUsuario> buscarPorUsuario(Integer idUsuario);

    List<AssociacaoEquipeUsuario> buscarPorEquipe(Integer idEquipe);
    
    Optional<AssociacaoEquipeUsuario> buscarPorId(Integer id);

    void salvar(AssociacaoEquipeUsuario associacao);
 }
