import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhação {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("When drawing a number, enter 0 ... 100\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Started the game! Good luck!");
			tentativas = 0;
			
		do {
				tentativas++;
				System.out.printf("tentativa %d:", tentativas);
				numero = entrada.nextInt();
				
				if(numero > numeroSorteado) {
					System.out.printf("The number is less than %d... \n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("The number is greater than %d \n\n", numero);
				} else {
					System.out.printf("\n\n That's it! you got it right in %d attempts\n\n", tentativas);
				}
				
		}while (numero != numeroSorteado);
				System.out.println("Enter 0 to exit or any other number to continue: ");
				continuar = entrada.nextInt();
				
		}while (continuar != 0);
		entrada.close();
		
	}

}