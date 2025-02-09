package Arrays_Declaração;

public class Maior {

	public static void main(String[] args) {
		
		 // Criação de um array com 4 números
        int[] numeros = {15, 8, 230, 42};
        
        // Inicializa a variável maiorNumero com o primeiro número do array
        int maiorNumero = numeros[0];

        // Loop para percorrer o array e encontrar o maior número
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

			
			System.out.println(maiorNumero);
		
		
		
	}
}
