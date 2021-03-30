package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero")));
		}
		
		int posicao = Integer.valueOf(JOptionPane.showInputDialog("qual posicao vc deseja ler"));
		
		System.out.println(lista.get(posicao));

	}

}
