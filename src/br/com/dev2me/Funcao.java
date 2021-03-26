package br.com.dev2me;

public class Funcao {
	
	static double n1 = 7;
	static double n2 = 8;
	
	public static void main(String[] args) {
		n1 = 1; // Acesso direto
		n1 = 2; // Acesso direto
		n1 = 3; // Acesso direto
		System.out.println(n1); // Acesso direto
		
		setN1(1); //Acesso com encapsulamento
		setN1(2); //Acesso com encapsulamento
		setN1(3); //Acesso com encapsulamento
		System.out.println(getN1()); //Acesso com encapsulamento
	}
	
	public static void setN1(double paramN1) {
		n1 = paramN1;
	}
	
	public static double getN1() {
		return n1;
	}

}
