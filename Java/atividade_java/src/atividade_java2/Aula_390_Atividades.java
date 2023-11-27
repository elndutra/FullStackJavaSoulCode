package atividade_java2;

import java.util.Scanner;

public class Aula_390_Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
        Pessoa pessoa1 = new Pessoa("Pedro", 18);
        // Obtendo e exibindo informações iniciais da pessoa
        System.out.println("Nome inicial: " + pessoa1.getNome());
        System.out.println("Idade inicial: " + pessoa1.getIdade());
        System.out.println("");
        // Solicitando que o usuário digite seu nome
        System.out.println("Digite o nome: ");
        String nNome = scan.next();

        // Solicitando que o usuário digite sua idade
        System.out.println("Digite sua idade: ");
        int nIdade = scan.nextInt();

        // Usando métodos setters para atualizar os atributos
        pessoa1.setNome(nNome);
        pessoa1.setIdade(nIdade);

        // Exibindo informações atualizadas da pessoa
        System.out.println("\nInformações da Pessoa Atualizadas:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        
        
		// Instanciando um objeto da classe MinhaClasse
        MeuConstrutor meuObjeto = new MeuConstrutor();
        
    	
 	   // Instanciando um objeto da classe Calculadora com o primeiro construtor
         Soma soma1 = new Soma();
    
       // Solicitando que o usuário digite dois números
         System.out.println("Digite o primeiro número: ");
         int numero1 = scan.nextInt();
         System.out.println("Digite o segundo número: ");
         int numero2 = scan.nextInt();

         // Instanciando um objeto da classe Calculadora com o segundo construtor
         Soma soma2 = new Soma(numero1, numero2);
	}

}
