package Excercicios_OperadorTernario;
import java.util.Scanner;

public class DescontoPreco {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

        // Entrada do preço do produto
        System.out.println("Digite o preço do produto: ");
        double preco = scn.nextDouble();

        // Cálculo do desconto usando operador ternário
        double desconto = (preco > 100) ? preco * 0.10 : preco * 0.05;

        // Preço final após o desconto
        double precoFinal = preco - desconto;

        // Saída
        System.out.printf("O desconto aplicado foi: R$ %.2f%n", desconto);
        System.out.printf("O preço final do produto é: R$ %.2f%n", precoFinal);

        // Fechando o Scanner
        scn.close();
	}
}
