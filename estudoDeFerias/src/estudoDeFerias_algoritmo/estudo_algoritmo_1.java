package estudoDeFerias_algoritmo;

import java.util.Scanner;

public class estudo_algoritmo_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite o peso: ");
		double massa = sc.nextDouble();
		
		System.out.println("digite a altura: ");
		double altura = sc.nextDouble();
			
		double Imc = massa / (altura*altura);
		
		System.out.printf(" o seu IMC é: %.2f %n",Imc);
		
		 if ( Imc >= 18.5 & Imc < 25) {
			 
			 System.out.println("Parabéns! Você esta no seu peso ideal");
			 
		 }
		
		 else {
			
			System.out.println("Você esta não está na faixa de peso ideal");
			}
		
	
		sc.close();

	}

}
