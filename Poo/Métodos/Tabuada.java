package Métodos;

public class Tabuada {
	
	int produto, resultado;
	
	int exibirTabuada(int produto) {
		for(int i = 0; i <= 10; i++) {
			resultado = produto * i;
			System.out.println(produto + " x " + i + " = " + resultado);
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Tabuada tb = new Tabuada();
		
		tb.exibirTabuada(6);
	}
}
