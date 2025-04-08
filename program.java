package application;

import java.util.Locale;
import java.util.Scanner;
import entities.rectangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criar uma instancia do objeto rec, da classe rectangle.
		rectangle rec = new rectangle();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		// chamar as funçoes da subrotina 
		System.out.printf("Área = %.2f%n", rec.area());
		System.out.printf("Perimetro = %.2f%n", rec.perimeter());
		System.out.printf("Diagonal = %.2f%n",rec.diagonal());
		sc.close();
		

	}

}
