package atividade_java2;

public class Soma {
	   // Primeiro construtor que exibe uma mensagem
    public Soma() {
        System.out.println("Vamos realizar uma soma!");
    }

    // Segundo construtor que recebe dois parâmetros e realiza um cálculo
    public Soma(int n1, int n2) {
        int resultado = n1 + n2;
        System.out.println("Resultado do cálculo: " + resultado);
    }
}
