package Métodos;

public class MediaAlunos {
	
	double nota1;
	double nota2;
	double nota3;
	
	double mediaAlunos(double nota1, double nota2, double nota3) {
		double media = (nota1 + nota2 + nota3) / 2;
		return media;
	}

	public static void main(String[] args) {
		MediaAlunos md = new MediaAlunos();
		
		System.out.println(md.mediaAlunos(6.0, 5.0, 5.0));
	}
}
