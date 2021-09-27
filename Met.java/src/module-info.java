import java.util.Scanner;

public class Met {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		float n1 = teclado.nextFloat ();
		System.out.println("Digite a seguda nota:");
		float n2 = teclado.nextFloat();
		
		System.out.println(verificarNota(n1, n2));
}
	
private static String verificarNota(float n1, float n2) {
	float media = (n1 + n2) / 2;
	
	if (media == 10) {
		return "Aluno aprovado com mérito!!!";
	} else if (media >=6) {
		return "Aluno aprovado!!!";
	} else {
		return "Aluno aprovado!!!";
	}
}