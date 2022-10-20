package br.com.feiradeprojetos;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.feiradeprojetos.classes.Usuarios.Aluno;
import br.com.feiradeprojetos.classes.Usuarios.Avaliador;
import br.com.feiradeprojetos.utilities.Cls;

@SpringBootApplication
public class FeiradeprojetosApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FeiradeprojetosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		// Aluno
			// Cadastro do aluno
				Cls.exec();
				Scanner scan = new Scanner(System.in);

				System.out.println("Primeiro, vamos começar cadastrando um Aluno\n");

				System.out.println("Nome: ");
				String nomeAluno = scan.nextLine();

				System.out.println("\nApelido: ");
				String apelidoAluno = scan.nextLine();

				System.out.println("\nEmail: ");
				String emailAluno = scan.nextLine();

				System.out.println("\nSenha: ");
				String senhaAluno = scan.nextLine();
				Cls.exec();

			// Criando os objetos do aluno
				Aluno aluno = new Aluno(nomeAluno, apelidoAluno, emailAluno, senhaAluno);
			
			// Perfil do Aluno
				Integer perfil = 0;

				Cls.exec();

				System.out.println("Cadastro de Equipe\n");
				System.out.println("Nome da Equipe: ");
				String nomeEquipe = scan.nextLine();
				aluno.criarEquipe(nomeEquipe);

				System.out.println("\nCadastro de Projeto\n");
				System.out.println("Nome do Projeto: ");
				String nomeProjeto = scan.nextLine();
				aluno.equipeAluno.criarProjeto(nomeProjeto);

				Cls.exec();

				System.out.printf("Olá, %s\n\n", aluno.getNome());
				System.out.println("Informações Pessoais");
				System.out.println("	Apelido: "+aluno.getNomeUsuario());
				System.out.println("	Email: "+aluno.getEmail());

				System.out.println("\nEquipes");
				System.out.println("	"+aluno.equipeAluno.getNome());

				System.out.println("\nProjetos");
				System.out.println("	"+aluno.equipeAluno.projetoEquipe.getNome());

				String ignore = scan.nextLine();

		// Cadastrando Avaliador
			Cls.exec();

			System.out.println("Vamos cadastrar um Avaliador\n");

			System.out.println("Nome: ");
			String nomeAvaliador = scan.nextLine();

			System.out.println("\nApelido: ");
			String apelidoAvaliador = scan.nextLine();

			System.out.println("\nEmail: ");
			String emailAvaliador = scan.nextLine();

			System.out.println("\nSenha: ");
			String senhaAvaliador = scan.nextLine();
			Cls.exec();
		
		// Criando objetos do avaliador
			Avaliador avaliador = new Avaliador(nomeAvaliador, apelidoAvaliador, emailAvaliador, senhaAvaliador);

		// Perfil do Avaliador
			Cls.exec();

			System.out.printf("Olá, %s\n\n", avaliador.getNome());
			System.out.println("Informações Pessoais");
			System.out.println("	Apelido: "+avaliador.getNomeUsuario());
			System.out.println("	Email: "+avaliador.getEmail());

			System.out.println("\nAvaliação: "+aluno.equipeAluno.projetoEquipe.getNome());

			System.out.println("Dê uma nota ao projeto: ");
			Float notaProjeto = scan.nextFloat();

			avaliador.avaliarProjeto(aluno.equipeAluno.projetoEquipe, notaProjeto);
	}
	

}
