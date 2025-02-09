package If_Else;
import java.util.Scanner;

public class MaiordeTres {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int  maior;
		
		System.out.println("Digite o primeiro valor: ");
        int a = scn.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int b = scn.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        int c = scn.nextInt();
        
       if(a > b && a > c) {
    	   maior = a;
       }
       else if(b > c) {
    	   maior = b;
       }
       else {
    	   maior = c;
       }
        
        System.out.println("Maior: " + maior);
	}
}
