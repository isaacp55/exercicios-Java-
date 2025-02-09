package Arrays_Declaração;

public class ContarElementosPares {

	public static void main(String[] args) {
	
		int [] numeros = {1,2,3,4,5,6};
		
		int contadorPares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println("Elementos Pares: " + numeros[i] );
				contadorPares++;
			}
		}
		
		System.out.println("Quantidade de Elementos Pares: " + contadorPares );
	
	}
}
