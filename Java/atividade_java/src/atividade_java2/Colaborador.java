package atividade_java2;

public class Colaborador extends Pessoa  {

	    String cargo;

	    // Construtor da classe Colaborador
	    public Colaborador(String nome, int idade, String cargo) {
	        super(nome, idade);  // Chama o construtor da classe Pessoa
	        this.cargo = cargo;
	}

}
