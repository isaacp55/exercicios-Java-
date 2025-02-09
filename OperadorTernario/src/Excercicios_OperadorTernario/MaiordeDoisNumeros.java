package Excercicios_OperadorTernario;
import java.util.Scanner;

public class MaiordeDoisNumeros {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = scn.nextInt();

		System.out.println("Digite o segundo número: ");
		int n2 = scn.nextInt();
		
		String mensagem = (n1 > n2)? "O primeiro número é maior que o segundo número" : "O segundo número é maior que o primeiro número";	
		System.out.println(mensagem);	
	}
}
