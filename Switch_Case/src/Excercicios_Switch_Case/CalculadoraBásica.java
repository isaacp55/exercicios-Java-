package Excercicios_Switch_Case;
import java.util.Scanner;

public class CalculadoraBásica {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double n1 = scn.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double n2 = scn.nextDouble();
		
		System.out.println("Escolha um dos operadores: '+', '-', '*', '/' ");
		char operacao = scn.next().charAt(0);
		
		switch(operacao) {
		case '+':
			System.out.println("Resultado: " + (n1 + n2));
			break;
			
		case '-':
			System.out.println("Resultado: " + (n1 - n2));
			break;
			
		case '*':
			System.out.println("Resultado: " + (n1 * n2));
			break;
			
		case '/':
            if (n2 != 0) {
                System.out.println("Resultado: " + (n1 / n2));
            } else {
                System.out.println("Erro: divisão por zero.");
            }
            break;
        default:
            System.out.println("Operação inválida.");
            break;
		}
	}
}
