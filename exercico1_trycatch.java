package tratamentoexcecoes_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercico1_trycatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		boolean valoresValidos = false;
		
		while (!valoresValidos) {
			try {
				System.out.println("Digite o primeiro valor: ");
				num1= (sc.nextInt());
				System.out.println("\nDigite o segundo valor: ");
				num2= (sc.nextInt());
				
				valoresValidos =  true;								
			}catch (InputMismatchException e) {
				System.out.println("Valores inválidos! ");	
				sc.nextLine(); //limpando o buffer
			}
		}

		int total = num1 + num2;
		System.out.println("A soma dos valores é: " + total);		
		

	} 

}
