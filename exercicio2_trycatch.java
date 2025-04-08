package tratamentoexcecoes_trycatch;

import java.util.Scanner;

public class exercicio2_trycatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerador, denominador;
		double resposta = 0;
		
		System.out.println("Digite o numerador: ");
		numerador = sc.nextInt();
		while (true) {
			try {
				System.out.println("Digite o denominador: ");
				denominador = sc.nextInt();
				
				resposta = numerador/denominador;
				break;
			}catch (ArithmeticException e) {
				System.out.println("Erro! Divisão por ZERO é impossível.");
			}
		}
		System.out.println("O resultado da divisão é: "+  resposta);
		sc.close();
		

	} 

}
