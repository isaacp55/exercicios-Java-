package Do_While;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		int contador = 1;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int N = scn.nextInt();
		
		do {
			System.out.println("Contagem: " + contador);
			contador++;
		}
		while(N >= contador);

		
	}

}
