package br.com.dev2me.aula3;

public class Ex1 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			falar(i);
		}
		
	}
	
	public static void falar(int i) {
		System.out.println("O Rafael sabe falar " + i);
	}
	
	public static void correr() {
		System.out.println("O Rafael sabe correr ....");
	}
	
	public static void pular() {
		System.out.println("O Rafael sabe pular ....");
	}
	
	public static void jogar() {
		System.out.println("O Rafael sabe jogar ....");
	}
	
	public static void calcularMedia() {
		int soma = ((3 + 4 + 7) / 2) * 12;
		System.out.println(soma);
	}

}
