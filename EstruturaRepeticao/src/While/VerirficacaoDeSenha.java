package While;
import java.util.Scanner;

public class VerirficacaoDeSenha {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		 // Define a senha correta
        int senhaCorreta = 1234;
        int senha;

        System.out.println("Digite a senha para acessar:");

        // Solicita a senha enquanto ela estiver incorreta
        while (true) {
            System.out.print("Senha: ");
            senha = scn.nextInt();

            // Verifica se a senha está correta
            if (senha == senhaCorreta) {
                System.out.println("Acesso permitido!");
                break; // Sai do loop quando a senha estiver correta
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        scn.close();
	}
}
