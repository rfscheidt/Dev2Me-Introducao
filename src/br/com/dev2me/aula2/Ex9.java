package br.com.dev2me.aula2;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		int opcao = 0;
		
		do {  
			opcao = Integer.parseInt( JOptionPane.showInputDialog("Digite uma opção  "
					+ "  - 1) Cadastrar Aluno, "
					+ "2) Cadastrar Professor, "
					+ "9) Sair do programa."));

			if (opcao == 1) {
				System.out.println("Cadastrar Aluno");
			}
			if (opcao == 2) {
				System.out.println("Cadastrar Professor");
			}	    	
		} 
		while(opcao != 9);

		System.out.println("Programa finalizado.");
	}


}
