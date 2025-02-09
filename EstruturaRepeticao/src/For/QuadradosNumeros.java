package For;
import java.util.Scanner;

public class QuadradosNumeros {

	public static void main(String[] args) {
		 System.out.println("Quadrados dos números de 1 a 5:");

	        for (int i = 1; i <= 5; i++) {
	            int quadrado = i * i; // Calcula o quadrado do número
	            System.out.println(i + "^2 = " + quadrado);
	        }
	}
}
