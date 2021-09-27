import java.util.Random;

 public class Principal {
	 
   public static void main(String[] args) {
	  Scanner teclado = new Scanner(System.in);
	  Random num = new Random();
	   
	  int numeroUsuario;
	  int escolhaComputador;
	  
	  numeroUsuario = teclado.nextInt();
	  escolhaComputador = teclado.extInt();
	  
	  switch (escolhaComputador) {
	  case 1:
		System.out.println("Computador escolheu papel");
		break;
		
	  case 2:
		System.out.println("Computador escolheu pedra");
		break;
		
	 
	  case 3:
		System.out.println("Computador escolheu tesoura");
		break;
	  
   }
 }