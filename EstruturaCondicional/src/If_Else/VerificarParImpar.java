package If_Else;
import java.util.Scanner;

public class VerificarParImpar {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: "); 
		int N = scn.nextInt();
		
		if(N % 2 == 0) {
			System.out.println("Par");
		}else {
            System.out.println("Ímpar");
		}
	}
}
