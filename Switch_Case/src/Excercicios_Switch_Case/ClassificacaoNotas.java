package Excercicios_Switch_Case;
import java.util.Scanner;

public class ClassificacaoNotas {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);

		System.out.println("Digite uma letra: 'A', 'B', 'C', 'D'");
		char N = scn.nextLine().charAt(0);
		
		switch(N) {
		case 'A':
			System.out.println("Excelente");
			break;
		case 'B':
			System.out.println("Bom");
			break;
		case 'C':
			System.out.println("Normal");
			break;
		case 'D':
			System.out.println("Ruim");
			break;
			default:
				System.out.println("Erro");
		}
	}
}
