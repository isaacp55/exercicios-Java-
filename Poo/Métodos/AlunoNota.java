package Métodos;

public class AlunoNota {
	
	private String nome;
	private float nota1;
	private float nota2;
	
	 public AlunoNota (String nome, float nota1, float nota2) {
	        this.nome = nome;
	        this.nota1 = nota1;
	        this.nota2 = nota2;
	    }

	public float CalcularMedia() {
		return (nota1 + nota2) / 2;
	}
	
	public void exibirStatus() {
		  float media = CalcularMedia();
		  if (media >= 7) {
	            System.out.println(nome + " está Aprovado com média: " + media);
	        } else {
	            System.out.println(nome + " está Reprovado com média: " + media);
	        }
	}
	
	public static void main(String[] args) {
		AlunoNota aluno1 = new AlunoNota("Ana", 3.5f, 4.5f);
		
		System.out.println("Média: " + aluno1.CalcularMedia());
		aluno1.exibirStatus();
		
		
	}

}
