package For;
import java.util.Scanner;

public class RepetirMensagem {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Mensagem:");	
		String mensagem = scn.nextLine();
		System.out.println("Repetição:");	
		int N = scn.nextInt();
		
		for(int i= 1; i <= N; i++) {	
			System.out.println(mensagem);			
		}
	}
}
