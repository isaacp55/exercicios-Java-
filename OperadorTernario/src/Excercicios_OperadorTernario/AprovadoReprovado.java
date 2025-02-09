package Excercicios_OperadorTernario;
import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		int nota = scn.nextInt();
		
		String mensagem = (nota >= 6) ? "Aprovado" : "Reprovado";
		System.out.println(mensagem);
 
	}
}
