package Do_While;
import java.util.Scanner;

public class ContagemRegressiva {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int contador = 1;
		
		
		System.out.println("Digite um número: ");
		int N = scn.nextInt();
		
		do {
			System.out.println("Contagem: " + N);
			N--;
		}while( N >= contador);
		
		

	}
}
