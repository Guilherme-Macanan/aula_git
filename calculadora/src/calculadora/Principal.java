package calculadora;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Digite o primeiro n�mero:");
		float num1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo n�mero:");
		float num2 = teclado.nextFloat();
		
		teclado.close();
		
		float resultadoSoma = calc.somar(num1, num2);
		System.out.printf("O resultado da soma � %.2f",
	 resultadoSoma);;
	  
	 // Daqui para baixo
	}
}