package Excercicios_OperadorTernario;
import java.util.Scanner;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
        int idade = scn.nextInt();
        
        String mensagem = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
        System.out.println(mensagem);
        
	}
}
