package Métodos;

public class Celular {

	String nome;
	String button;
	String sistemaOperacional;
	float tamanhoTela;
	
	
	void ligarCelular(String button) {
		if(button == "Sim"){
			System.out.println("Ligou");
		}
		else {
			System.out.println("Desligou");
		}
	}
	
	void aumentarVolume(String button) {
		if(button == "Aumentar"){
			System.out.println("Aumentar volume");
		}
		else {
			System.out.println("Diminuir");
		}
	}
	
	 void clicarApp(String button) {
		if(button == "Photos"){
			System.out.println("Mostrar fotos");
		}
		else if(button == "Segurar Photos") {
			System.out.println("Remove app, Favorites, Search");
		}else {
			System.out.println("Mantem tela neutra");
		}
	}
	
	public static void main(String[] args) {
		
		Celular c1 = new Celular();
		
		c1.ligarCelular("Sim");
		c1.aumentarVolume("Aumentar");
		c1.clicarApp("Segurar Photos");
		
	}
}
