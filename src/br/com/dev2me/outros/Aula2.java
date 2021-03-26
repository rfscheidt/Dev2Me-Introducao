package br.com.dev2me.outros;

import javax.swing.JOptionPane;

public class Aula2 {

	public static void main(String[] args) {
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo numero"));

		System.out.println(n1 + n2);
	}

}
