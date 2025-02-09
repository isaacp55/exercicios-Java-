package While;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para ver a tabuada: ");
	        int numero = scanner.nextInt();

	        int multiplicador = 1; // Começa a multiplicar de 1

	        System.out.println("Tabuada de " + numero + ":");
	        
	        // Gera a tabuada de 1 a 10
	        while (multiplicador <= 10) {
	            int resultado = numero * multiplicador;
	            System.out.println(numero + " x " + multiplicador + " = " + resultado);
	            multiplicador++; // Incrementa o multiplicador
	        }

	}
}
