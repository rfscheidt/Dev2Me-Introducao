package br.com.dev2me.aula4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		/**
		 * int[] idades = new int[3];
		
		idades[0] = 3;
		idades[1] = 3;
		idades[2] = 3;
		idades[4] = 3;
		 */
		
		List<Integer> idades = new ArrayList<Integer>();
		System.out.println(idades.size());
		
		for (int i = 0; i < 3; i++) {
			idades.add(Integer.valueOf(JOptionPane.showInputDialog("Digite um numero")));
		}
		
		System.out.println(idades.size());
	}

}
