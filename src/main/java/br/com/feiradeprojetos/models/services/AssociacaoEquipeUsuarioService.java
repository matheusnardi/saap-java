package br.com.feiradeprojetos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.feiradeprojetos.models.entities.AssociacaoEquipeUsuario;
import br.com.feiradeprojetos.models.repositories.AssociacaoEquipeUsuarioRepository;

@Service
public class AssociacaoEquipeUsuarioService implements IAssociacaoEquipeUsuarioService{
    @Autowired
    AssociacaoEquipeUsuarioRepository associacaoRepository;

    @Override
    public List<AssociacaoEquipeUsuario> buscarTodos(){
        return associacaoRepository.findAll();
    }

    @Override
    public List<AssociacaoEquipeUsuario> buscarPorUsuario(Integer idUsuario){
        return associacaoRepository.findAllByIdUsuario(idUsuario);
    }

    @Override
    public List<AssociacaoEquipeUsuario> buscarPorEquipe(Integer idEquipe){
        return associacaoRepository.findAllByIdEquipe(idEquipe);
    }

    @Override
    public Optional<AssociacaoEquipeUsuario> buscarPorId(Integer id){
        return associacaoRepository.findById(id);
    }

    @Override
    public void salvar(AssociacaoEquipeUsuario associacao){
        associacaoRepository.save(associacao);
    }
    
}
