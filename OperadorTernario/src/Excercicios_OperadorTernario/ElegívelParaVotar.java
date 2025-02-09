package Excercicios_OperadorTernario;
import java.util.Scanner;

public class ElegívelParaVotar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		int idade = scn.nextInt();
		
		String mensagem = (idade >= 18)? "Pode votar" : "Não pode votar";
		System.out.println(mensagem);
	}
}
