package For;
import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Números pares entre 0 e 20");
		
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
