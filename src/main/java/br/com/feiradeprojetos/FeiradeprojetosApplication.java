package br.com.feiradeprojetos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.feiradeprojetos.models.entities.AssociacaoUsuarioEquipe;
import br.com.feiradeprojetos.models.entities.Equipe;
import br.com.feiradeprojetos.models.entities.Usuario;
import br.com.feiradeprojetos.models.repositories.AssociacaoUsuarioEquipeRepository;
import br.com.feiradeprojetos.models.repositories.EquipeRepository;
import br.com.feiradeprojetos.models.repositories.UsuarioRepository;

@SpringBootApplication
public class FeiradeprojetosApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private EquipeRepository equipeRepository;

	@Autowired
	private AssociacaoUsuarioEquipeRepository associacao;

	public static void main(String[] args) {
		SpringApplication.run(FeiradeprojetosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		var u1 = new Usuario("Matheus Nardi", "SnakeNardi", "matheuseduardonardi@gmail.com", "123456789");
		var e1 = new Equipe("Equipe Teste");
		var a1 = new AssociacaoUsuarioEquipe(u1, e1);

		usuarioRepository.save(u1);
		equipeRepository.save(e1);
		associacao.save(a1);
	}
	

}
