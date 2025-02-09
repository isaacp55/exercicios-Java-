package For;


public class QuadradoElementosArray {

	public static void main(String[] args) {
		 
		 // Definindo o array
        int[] numeros = {2, 4, 6, 8, 10};

        System.out.println("Quadrados dos elementos do array:");

        // Loop para calcular o quadrado de cada elemento
        for (int i = 0; i < numeros.length; i++) {
            int quadrado = numeros[i] * numeros[i]; // Calcula o quadrado
            System.out.println("O quadrado de " + numeros[i] + " é " + quadrado);
        }
	}
}
