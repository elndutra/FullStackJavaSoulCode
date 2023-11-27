package atividade_java2;

public class Pfisica extends Pessoa {
	// Atributo adicional para CPF
    private String cpf;

    // Construtor da classe PessoaFisica
    public Pfisica (String nome, int idade, String cpf) {
        super(nome, idade);  // Chama o construtor da classe Pessoa
        this.cpf = cpf;
    }

    // Método getter para CPF
    public String getCpf() {
        return cpf;
    }
    
    // Método mostrarNome específico para PessoaFisica
    public void mostrarNome() {
        System.out.println("Bem-vindo, " + super.getNome() + "!");
    }
}
