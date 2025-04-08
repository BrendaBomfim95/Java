package entities;

public class rectangle {
	//criar nomes das variáveis, declarou publica.
	public double width;
	public double height;
	
	//criando uma funcao e o nome da função é area (é uma subrotina).
	public double area() {
		return width * height;
		
	}
	public double perimeter() {
		return 2 * (width * height);
		
	}
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

}
