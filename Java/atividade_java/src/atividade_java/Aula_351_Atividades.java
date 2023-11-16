package atividade_java;

import java.util.Scanner;

public class Aula_351_Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int number1;
				number1 = 10;
				String nome = "Soul On";
				
				int numero = 15;
				double numer_ponto = 2.5;
				boolean status = false;
				
				int numero_usuario;
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Digite um numero");
				
				numero_usuario = scan.nextInt();
				
				System.out.println("Você digito o numero " + numero_usuario);
				
				String nome_user , sobrenome;
				System.out.println("Digite seu nome");
				
				nome_user = scan.next();
				System.out.println("Digite seu Sobrenome");
				sobrenome = scan.next();
				
				System.out.println("Seu nome completo é " + nome_user + " " + sobrenome );

	}

}
