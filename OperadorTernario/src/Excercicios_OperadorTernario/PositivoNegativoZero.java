package Excercicios_OperadorTernario;
import java.util.Scanner;

public class PositivoNegativoZero {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);

	        // Solicita ao usuário que insira um número
	        System.out.println("Digite um número: ");
	        int numero = scn.nextInt();

	        // Verifica se o número é positivo, negativo ou zero
	        String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";

	        // Exibe o resultado
	        System.out.println("O número é: " + resultado);

	        // Fecha o Scanner
	        scn.close();
	}
}
