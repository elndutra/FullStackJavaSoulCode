package atividade_java2;

public class Animal {
	// Classe Animal

	    // Atributos inicializados
	    String nome = "Toto";
	    String especie = "Cachorro";
	    int idade = 3;
	    String cor = "Preto";

	    // Construtor vazio (pode ser omitido, já que Java fornece um construtor padrão implicitamente)

	    // Método para exibir informações do animal
	    void exibirInfo() {
	        System.out.println("Nome do cachorro: " + nome);
	        System.out.println("Espécie: " + especie);
	        System.out.println("Idade: " + idade);
	        System.out.println("Cor: " + cor);
	    }
	    
	    // Método que recebe nome e idade como parâmetros
	    public void informacoes(String nome, int idade) {
	        System.out.println("Nome do animal: " + nome);
	        System.out.println("Idade do animal: " + idade + " anos");
	    }

	    // Sobrecarga do método que recebe outros atributos
	    public void informacoes(String nome, int idade, String especie) {
	        System.out.println("Nome do animal: " + nome);
	        System.out.println("Idade do animal: " + idade + " anos");
	        System.out.println("Espécie do animal: " + especie);
	    }
	}


