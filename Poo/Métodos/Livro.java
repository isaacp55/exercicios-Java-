package Métodos;

public class Livro {

	private String titulo;
	private String autor;
	private int Publicacao;
	
	
	public Livro(String titulo, String autor, int Publicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.Publicacao = Publicacao;
	}
	
	public void exibirDetalhes() {
		System.out.println("Título: " + titulo + " Autor: " + autor + " Publicação: " + Publicacao);
	}
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
		
		l1.exibirDetalhes();
		
	}
}
