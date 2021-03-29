package br.com.dev2me.aula4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Digite um valor")));
		}
		
		lista.add(10);
		
		int soma = 0;
		for (int i = 0; i < lista.size(); i++) {
			soma = soma + lista.get(i);
		}
		
		System.out.println("Total somado eh: " + soma);
		
		
	}

}
