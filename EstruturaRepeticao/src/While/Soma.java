package While;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int soma = 0;
		
		System.out.println("Digite um valor:");
		int N = scn.nextInt();
		
		while(N != 0) {
			soma += N;
			System.out.println("Digite um valor:");
			 N = scn.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		
	}
}
