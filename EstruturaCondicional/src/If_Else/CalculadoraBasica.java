package If_Else;
import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		
    Scanner scn = new Scanner(System.in);
    
    // Solicita os dois números ao usuário
    System.out.print("Digite o primeiro número: ");
    double num1 = scn.nextDouble();

    System.out.print("Digite o segundo número: ");
    double num2 = scn.nextDouble();

    // Solicita a operação desejada
    System.out.print("Digite a operação desejada (+, -, *, /): ");
    char operacao = scn.next().charAt(0);

    // Realiza o cálculo com base na operação escolhida
    switch (operacao) {
        case '+':
            System.out.println("Resultado: " + (num1 + num2));
            break;
        case '-':
            System.out.println("Resultado: " + (num1 - num2));
            break;
        case '*':
            System.out.println("Resultado: " + (num1 * num2));
            break;
        case '/':
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: divisão por zero.");
            }
            break;
        default:
            System.out.println("Operação inválida.");
            break;
    }

	}
}
