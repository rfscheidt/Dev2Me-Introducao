package br.com.dev2me.aula4;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		int[] idades = new int[3];
		
		for (int j = 0; j < idades.length; j++) {
			nomes[j] = JOptionPane.showInputDialog("Digite o nome do corredor");
			idades[j] = Integer.valueOf(JOptionPane.showInputDialog("Digite o nome do corredor"));
		}
		
		int media = 0;
		for (int i = 0; i < idades.length; i++) {
			media = media + idades[i];
		}
		System.out.println("A media dos corredores é: " + media / idades.length);
		
	}

}
