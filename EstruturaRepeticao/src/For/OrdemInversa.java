package For;
import java.util.Scanner;

public class OrdemInversa {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int N = scn.nextInt();
		
		System.out.println("Saída:");
		
		for(int i = N; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
