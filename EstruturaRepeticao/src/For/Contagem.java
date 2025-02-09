package For;
import java.util.Scanner;

public class Contagem {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int N = 0;
        System.out.println("Digite um numero: ");
		 N = scn.nextInt();
		 
		for(int i = 1; i <= N; i++) { 
			System.out.println(i);
		}
	}
}
