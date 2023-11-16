package atividade_java;

import java.util.Scanner;

public class Aula_354_Atividades {

	public static void main(String[] args) {
		/*---------------------------------------------------------------*/
		int n1, n2, resultado;
		
		// Crie um variável que some dois valores informados pelo usuário;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		n2 = scan.nextInt();
		
		resultado = n1 + n2;
		System.out.println("O resultado da variavel é = "+ resultado);
		
		System.out.println("------------------------------------------------------------------");
		
		/*---------------------------------------------------------------*/
		
		// Use o incremento de variáveis e some uma variável;
		resultado++;
		System.out.println("O incremento da variavel é = "+ resultado);
		
		// Crie uma variável e faça o decremento;
		resultado--;
		System.out.println("O decremento da variavel é = "+ resultado);
		System.out.println("------------------------------------------------------------------");
		
		/*---------------------------------------------------------------*/
		
		//Faça um programa que calcule a soma, multiplicação e subtração de 2 números;
		System.out.println("Agora realizaremos a soma, mutiplicação e subtração");
		System.out.println("Digite um numero ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		n2 = scan.nextInt();
		
		resultado = n1 + n2;
		System.out.println("O resultado da soma da variavel é = "+ resultado);
		
		resultado = n1 * n2;
		System.out.println("O resultado da mutiplicação da variavel é = "+ resultado);
		
		resultado = n1 - n2;
		System.out.println("O resultado da soma da variavel é = "+ resultado);
		
		
		System.out.println("------------------------------------------------------------------");
		
		/*---------------------------------------------------------------*/
		
		int num1, num2, num3, resultNum;
		// Solicite ao usuário que informe três valores, salve em variáveis diferentes e faça o cálculo delas.
		System.out.println("Agora realizaremos a soma, mutiplicação e subtração");
		System.out.println("Digite um numero ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		num3 = scan.nextInt();
		
		resultNum = num1 + num2 + num3;
		System.out.println("O resultado da soma da variavel é = "+ resultNum);
		
		System.out.println("------------------------------------------------------------------");

	}

}
