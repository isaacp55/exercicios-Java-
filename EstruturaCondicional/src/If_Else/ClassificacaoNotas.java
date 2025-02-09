package If_Else;
import java.util.Scanner;

public class ClassificacaoNotas {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
     
     
     System.out.println("Digite uma nota:");
     int nota = scn.nextInt();
     
     if (nota >= 90) {
         System.out.println("Nota: A");
     } else if (nota >= 80) {
         System.out.println("Nota: B");
     } else if (nota >= 70) {
         System.out.println("Nota: C");
     } else if (nota >= 60) {
         System.out.println("Nota: D");
     } else {
         System.out.println("Nota: F");
     }
     
	}
}
