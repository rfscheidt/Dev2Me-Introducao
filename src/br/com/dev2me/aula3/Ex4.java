package br.com.dev2me.aula3;

public class Ex4 {
	
	private static int n1 = 0;

	public static void main(String[] args) {
		setN1(1);
		System.out.println(getN1());
		setN1(2);
		falar();
	}
	
	public static void falar() {
		System.out.println(getN1());
	}
	
	public static void setN1(int paramN1) {
		n1 = paramN1;
	}
	
	public static int getN1() {
		return n1;
	}

}
