package br.com.dev2me.aula2;

public class Ex5 {

	public static void main(String[] args) {
		int estoque = 1;
		
		if (estoque >= 100) {
			System.out.println("produto com quati sufi");
		}
		else if (estoque < 100 && estoque > 50) {
			System.out.println("avaliar poss de um novo pedido");
		}
		else {
			System.out.println("faca um novo pedido");
		}

	}

}
