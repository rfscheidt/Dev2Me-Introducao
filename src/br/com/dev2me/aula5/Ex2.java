package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		int tamanhoDaLista = Integer.valueOf(JOptionPane.showInputDialog("qual o tamanho da sua lista"));

		for (int i = 0; i < tamanhoDaLista; i++) {
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero " + i)));
		}
		
		int soma = 0;
		for (int i = 0; i < tamanhoDaLista; i++) {
			soma = soma + lista.get(i);
		}
		
		System.out.println("A soma do meu vetor ou lista: " + soma);

	}

}
