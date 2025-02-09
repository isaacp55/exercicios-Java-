package While;
import java.util.Scanner;
public class ContagemRegressiva {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		int N = 0;
		
		System.out.println("Digite um numero para iniciar a contagem regressiva: ");
		N = scn.nextInt();
		
		while(N > 0) { 
			System.out.println("Contagem: " + N);
			N --; 
		}
		
		System.out.println("FIM");
	}

}
