package Excercicios_Switch_Case;
import java.util.Scanner;

public class NotasNumerais {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite uma nota de 0 a 10: ");
		int N = scn.nextInt();
		
		switch(N) {
		case 0: case 1: case 2: case 3: case 4:
			System.out.println("Classificação: Ruim");
			break;
			
		case 5: case 6: case 7:
			System.out.println("Classificação: Regular");
			break;
			
		case 8: case 9:
			System.out.println("Classificação: Bom");
			break;
			
		case 10:
			System.out.println("Classificação: Excelente");
			break;
			default:
				System.out.println("Erro");
		}
	}
}
