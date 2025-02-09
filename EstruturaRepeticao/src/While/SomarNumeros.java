package While;
import java.util.Scanner;

public class SomarNumeros {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int soma = 0;
		
		System.out.println("Digite um numero: ");
		 int N = scn.nextInt();
		 soma += N;
		
		while(soma < 100) {
			System.out.println("Digite outro numero: ");
			N = scn.nextInt();
			soma += + N;
		}
		System.out.println("Soma: " + soma);
		
	}
}
