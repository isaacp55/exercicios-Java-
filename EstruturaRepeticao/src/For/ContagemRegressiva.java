package For;
import java.util.Scanner;
public class ContagemRegressiva {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int N = scn. nextInt();
		
		System.out.println("Contagem: ");
		for(int i = N; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
