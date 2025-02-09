package Arrays_Declaração;

public class Soma_Elementos {

	public static void main(String[] args) {
		 // Criação do array
        int[] numeros = {10, 20, 30, 23, 45, 6, 7, 8, 9};

        // Variável para armazenar a soma
        int soma = 0;

        // Soma os elementos do array
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Exibe o resultado
        System.out.println("Soma: " + soma);
	}
}
