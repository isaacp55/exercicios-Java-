package While;
import java.util.Scanner;

public class UsuarioA {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char letra = 'A';
		System.out.println("Digite um único caractere: ");
		char N = scn.next().charAt(0);
		
		while(N != letra) {
			System.out.println("Digite outro caractere: ");
			 N = scn.next().charAt(0);
		}
		System.out.println(N);
	}
}
