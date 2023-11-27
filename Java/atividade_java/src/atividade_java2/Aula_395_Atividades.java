package atividade_java2;

import java.util.Scanner;

public class Aula_395_Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Solicitando que o usuário digite seu nome
        System.out.print("Digite um nome: ");
        Scanner scan = new Scanner(System.in);
        String user = scan.next();

        
        // Exemplo de PessoaFisica
        Pfisica pFisica = new Pfisica("Sebastião", 30, "123.456.789-01");
        System.out.println("Nome: " + pFisica.getNome());
        System.out.println("Idade: " + pFisica.getIdade());
        System.out.println("CPF: " + pFisica.getCpf());

        System.out.println();

        // Exemplo de PessoaJuridica
        Pjuridica pJuridica = new Pjuridica("Empresa Demilitadores", 5, "12.345.678/0001-09");
        System.out.println("Nome: " + pJuridica.getNome());
        System.out.println("Idade: " + pJuridica.getIdade());
        System.out.println("CNPJ: " + pJuridica.getCnpj());
        
        // Criando objetos das classes PessoaFisica e PessoaJuridica
        Pfisica pessoaFisica = new Pfisica( user, 20, "123.456.789-01");
        Pjuridica pessoaJuridica = new Pjuridica(user, 33, "12.345.678/0001-09");

        // Chamando o método mostrarNome para cada objeto
        System.out.println("\nMétodo Exibir nome da PessoaFisica:");
        pessoaFisica.mostrarNome();

        System.out.println("\nMétodo Exibir nome da PessoaJuridica:");
        pessoaJuridica.mostrarNome();
        
        System.out.println("");
        // Criando um objeto da classe Animal
        Animal anima2 = new Animal();

        // Chamando o primeiro método com nome e idade
        System.out.println("Método com nome e idade:");
        anima2.informacoes("Leão", 5);

        System.out.println();

        // Chamando o segundo método com nome, idade e espécie
        System.out.println("Método com nome, idade e espécie:");
        anima2.informacoes("Girafa", 3, "Giraffa camelopardalis");

        
        
        
	}

}
