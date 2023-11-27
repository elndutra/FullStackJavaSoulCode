package atividade_java2;

import java.util.Scanner;

public class Aula_385_Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // Instanciando um objeto da classe Animal
        Animal animal1 = new Animal();
       
        // Chamando o método para exibir informações do animal
        animal1.exibirInfo();
        
        
        // Criando objetos das classes Pessoa e Colaborador
        Pessoa pessoa = new Pessoa("João", 25);
        Colaborador colaborador1 = new Colaborador("Maria", 30, "Administradora");

        // Exibindo informações da pessoa
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println();

        // Exibindo informações do colaborador
        System.out.println("Informações do Colaborador:");
        System.out.println("Nome: " + colaborador1.getNome());
        System.out.println("Idade: " + colaborador1.getIdade());
        System.out.println("Cargo: " + colaborador1.cargo);
        
        //
        pessoa.msgPessoa();
        
        
        // Criando um objeto da classe Scanner para ler input do usuário
        Scanner scan = new Scanner(System.in);

        // Solicitando que o usuário digite seu nome
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scan.next();

        // Solicitando que o usuário digite sua idade
        System.out.print("Digite sua idade: ");
        int idadeUsuario = scan.nextInt();

        // Criando um objeto da classe Pessoa com os dados fornecidos pelo usuário
        Pessoa pessoaUsuario = new Pessoa(nomeUsuario, idadeUsuario);

        // Exibindo informações da pessoa
        System.out.println("\nPessoa:");
        System.out.println("Nome: " + pessoaUsuario.getNome());
        System.out.println("Idade: " + pessoaUsuario.getIdade());
        
        System.out.println("");
       

        
        
     
    
	  }
	
	
	
}


