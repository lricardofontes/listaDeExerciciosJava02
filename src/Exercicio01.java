//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
