package While;
import java.util.Scanner;
public class Nome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nome = "Sair";
		
		
		System.out.println("Digite nomes: ");
	    String  N = scn.nextLine();
		
		while(!N.equals(nome)) {
			System.out.println("Digite mais nomes: ");
			 N = scn.nextLine();
		}
		
		System.out.println(N);
		scn.close();
	}
}
