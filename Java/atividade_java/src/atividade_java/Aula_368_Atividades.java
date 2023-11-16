package atividade_java;

import java.util.Scanner;

public class Aula_368_Atividades {

	public static void main(String[] args) {
		int numero;
		int num1;
		int result1 = 0;
		int result2 = 0;
		int media = 0;
		int idade = 0;
		
		// Faça um programa que leia um valor inteiro e escreva os números pares anteriores a ele;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero que vou dizer se é par ou impar");
		numero = scan.nextInt();
		
		for ( int i = numero-1; i > 0; i--) {
			
		
			if( i%2 == 0) {
				System.out.println("Um número anterior ao digitado que é par " + i);
			}
			
		}
		
		System.out.println("------------------------------------------------------------------");
		
		/*---------------------------------------------------------------*/
		
		// Escreva um algoritmo que calcule a soma dos números de 1 a 15.
		for ( int i = 0; i <= 15; i++) {
			
			result1 += i;
			System.out.println(result1);
		}
		
			
		System.out.println("------------------------------------------------------------------");
		
		/*---------------------------------------------------------------*/
		
		// Leia um número inteiro e escreva a soma dos números pares do 2 até ele;
		System.out.println("Digite um numero");
		num1 = scan.nextInt();
		
		for ( int i = num1 ; i > 0 ; i--) {
			
		
			if( i%2 == 0) {
				result2 += i;
				
			}
			
		}
		System.out.println(result2);
		System.out.println("------------------------------------------------------------------");
		
	/*---------------------------------------------------------------*/
		
		// Leia a idade de 20 pessoas e exiba a média das idades.
		for ( int i = 1 ; i <= 20; i++) {

						
				System.out.println("Digite a "+ i +"º idade.");
				idade += scan.nextInt();	
		}
		
		media = idade / 20;
		System.out.println("A média de idade é " + media);
	
	System.out.println("------------------------------------------------------------------");
	
	/*---------------------------------------------------------------*/

	}

}
