package br.com.dev2me.aula4;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		String[] nomes = new String[1000];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite seu nome");
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("o nome lido na posicao " + i + " " + nomes[i]);
		}

	}

}
