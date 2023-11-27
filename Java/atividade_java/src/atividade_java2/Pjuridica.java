package atividade_java2;

public class Pjuridica extends Pessoa {
	  // Atributo adicional para CNPJ
    private String cnpj;

    // Construtor da classe PessoaJuridica
    public Pjuridica(String nome, int idade, String cnpj) {
        super(nome, idade);  // Chama o construtor da classe Pessoa
        this.cnpj = cnpj;
    }

    // Método getter para CNPJ
    public String getCnpj() {
        return cnpj;
    }
    
    // Método mostrarNome específico para PessoaJuridica
    public void mostrarNome() {
        System.out.println("Nome da Pessoa Jurídica: " + super.getNome());
    }
}
