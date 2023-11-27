package atividade_java2;

public class Pessoa {
	// Classe Pessoa

	    private String nome;
	    private int idade;

	    // Construtor da classe Pessoa
	    public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }
	    
	 // Métodos getters e setters para o atributo "nome"
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    // Métodos getters e setters para o atributo "idade"
	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }
	    
	    
	    void msgPessoa() {
	        System.out.println("Olá usuário");
	    }

}