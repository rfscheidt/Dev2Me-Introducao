package br.com.dev2me.aula3;

public class Ex2 {

	public static void main(String[] args) {
		
		String nome = "Alface";
		
		int n1 = 2;
		int n2 = 4;
		int mediaCalculada = calcularMedia(n1, n2, nome);
		
		if (mediaCalculada >= 6) {
			System.out.println("aluno apravado");
		}
		else {
			System.out.println("O aluno " + nome + " esta em recuperacao");
		}
	}
	
	public static int calcularMedia(int nota1, int nota2, String nomedoalunonafuncao) {
		int media = (nota1 + nota2) / 2;
		
		return media;
	}
	

}
