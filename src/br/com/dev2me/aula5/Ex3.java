package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero vai na posicao " + i)));
		}
		
		//POSICAO - 0 - 1 - 2
		//VALOR     10 -20 -30
		
		int aux = lista.get(0);
		lista.set(0, lista.get(2));
		lista.set(2, aux);
		
		//POSICAO - 0 - 1 - 2
		//VALOR     30 -20 -10
		
		for (int i = 0; i < 3; i++) {
			System.out.println(lista.get(i));
		}
	}

}
