package For;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int produto, resultado;
		
		System.out.println("Digite um número da Tabuada: ");
		produto = scn.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			resultado = produto * i;
			System.out.println(produto + " x " + i + " = " + resultado);
		}
	}
}