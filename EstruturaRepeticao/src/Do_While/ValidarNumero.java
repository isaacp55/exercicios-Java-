package Do_While;
import java.util.Scanner;

public class ValidarNumero {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero;
		
		do {
			 System.out.print("Digite um número positivo: ");
	            numero = scn.nextInt();
		}while(numero <= 0);
		
        System.out.println("Número válido: " + numero);

	}
}
