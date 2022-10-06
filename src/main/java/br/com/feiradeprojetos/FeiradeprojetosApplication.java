package br.com.feiradeprojetos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.feiradeprojetos.models.entities.AssociacaoEquipeUsuario;
import br.com.feiradeprojetos.models.entities.Equipe;
import br.com.feiradeprojetos.models.entities.Projeto;
import br.com.feiradeprojetos.models.entities.Usuarios.Aluno;
import br.com.feiradeprojetos.models.repositories.EquipeRepository;
import br.com.feiradeprojetos.models.repositories.ProjetoRepository;
import br.com.feiradeprojetos.models.repositories.Usuarios.AlunoRepository;
import br.com.feiradeprojetos.models.services.AssociacaoEquipeUsuarioService;

@SpringBootApplication
public class FeiradeprojetosApplication implements CommandLineRunner{

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private EquipeRepository equipeRepository;

	@Autowired
	private AssociacaoEquipeUsuarioService associacaoService;

	@Autowired
	private ProjetoRepository projetoRepository;

	public static void main(String[] args) {
		SpringApplication.run(FeiradeprojetosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		var u1 = new Aluno("Matheus Nardi", "SnakeNardi", "matheuseduardonardi@gmail.com", "123456789");
		var e1 = new Equipe("Equipe Teste");
		alunoRepository.save(u1);
		equipeRepository.save(e1);

		var a1 = new AssociacaoEquipeUsuario(u1.getId(), e1.getId());
		associacaoService.salvar(a1);

		var p1 = new Projeto("Projeto Teste", e1.getId());
		projetoRepository.save(p1);
	}
	

}
