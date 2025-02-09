package Excercicios_OperadorTernario;
import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int N = scn.nextInt();
		
		String mensagem = (N % 2 == 0) ? "Par" : "Ímpar";
		System.out.println(mensagem);
	}
}
