package If_Else;
import java.util.Scanner;

public class ClassificacaoIdade {

	public static void main(String[] args) {
		
     Scanner scn = new Scanner(System.in);
     
     System.out.println("Digite uma idade: ");
     int idade = scn.nextInt();
     
     if(idade < 18) {
    	 System.out.println("Menor de Idade");
     }else if(idade <= 65) {
    	 System.out.println("Adulto");
     }else {
    	 System.out.println("Idoso");
     }
     
     
	}
}
