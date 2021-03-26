package br.com.dev2me;

import java.util.Arrays;
import java.util.List;

public class Aula1 {

	public static void main(String[] args) {
		List<Integer> itens = Arrays.asList(1, 2, 3, 4, 5);
		
		for (Integer item : itens) {
			System.out.println(item);
		}
		
	}


}
