//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
//seguir, calcule e mostre o valor da conta a pagar.


import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do produto:");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade do produto:");
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
			System.out.println("Cachorro Quente");
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
			System.out.println("X-Salada");
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
			System.out.println("X-Bacon");
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
			System.out.println("Torrada Simples");
		}
		else {
			total = quantidade * 1.5;
			System.out.println("Refrigerante");
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
