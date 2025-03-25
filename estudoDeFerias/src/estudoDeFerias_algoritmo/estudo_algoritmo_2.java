package estudoDeFerias_algoritmo;

import java.util.Scanner;

public class estudo_algoritmo_2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um nº qualquer: ");
		double num = sc.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O nº "+ num +" é par");
		}
		else {
			System.out.println("O nº "+ num+ " é impar!");
		}
		
	}

}
