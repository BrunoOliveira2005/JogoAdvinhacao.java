import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhação {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numberSorteado;
		int attempts;
		int number;
		
		do {
			System.out.println("When drawing a number, enter 0 ... 100\n");
			Random numeroAleatorio = new Random();
			numberSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Started the game! Good luck!");
			attempts = 0;
			
		do {
				attempts++;
				System.out.printf("tentativa %d:", attempts);
				number = entrada.nextInt();
				
				if(number > numberSorteado) {
					System.out.printf("The number is less than %d... \n\n", number);
				} else if (number < numberSorteado) {
					System.out.printf("The number is greater than %d \n\n", number);
				} else {
					System.out.printf("\n\n That's it! you got it right in %d attempts\n\n", attempts);
				}
				
		}while (number != numberSorteado);
				System.out.println("Enter 0 to exit or any other number to continue: ");
				continuar = entrada.nextInt();
				
		}while (continuar != 0);
		entrada.close();
		
	}

}