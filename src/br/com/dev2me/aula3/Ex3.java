package br.com.dev2me.aula3;

public class Ex3 {
	
	public static int n1 = 0;
	public static int n2 = 0;
	public static String nome = "";
	
	public static void main(String[] args) {
		
		nome = "Alface";
		n1 = 5;
		n2 = 6;
		
		int mediaCalculada = calcularMedia();
		
		if (mediaCalculada >= 6) {
			System.out.println("aluno apravado");
		}
		else {
			System.out.println("O aluno " + nome + " esta em recuperacao");
		}
	}
	
	public static int calcularMedia() {
		int media = (n1 + n2) / 2;
		
		return media;
	}
	
	public static void falar() {
		n1  = 5;
	}
	
	public static void correr() {
		n2  = 5;
	}
	

}