package Métodos;

public class NumeroPar {

	int numero;
	
	int ehPar(int numero ) {
		int resultado = numero;
		if(numero % 2 == 0) {
			System.out.println("True");		
		}
		else {
			System.out.println("False");
		}
		return resultado;
	}


	public static void main(String[] args) {
		
		NumeroPar np = new NumeroPar();
		
		np.ehPar(3);
	}
}
