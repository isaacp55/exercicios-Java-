package Excercicios_OperadorTernario;
import java.util.Scanner;
public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = scn.nextInt();
		
		String mensagem = (n1 > 0) ? "Positivo" : "Negativo";
        System.out.println(mensagem);
        
	}
}
