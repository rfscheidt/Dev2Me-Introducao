package br.com.dev2me.aula2;

import javax.swing.JOptionPane;

public class ExTSE {

	public static void main(String[] args) {
		int opMesario = 0;
		int opVoto = 0;
		int totalVotosAngela = 0;
		int totalVotosGean = 0;
		int totalVotosCesar = 0;
		int totalVotosNulo = 0;
		int totalVotosBranco = 0;
		
		do {
			opMesario = Integer.valueOf(JOptionPane.showInputDialog("Alo mesario, digite 1 para abrir uma nova votação ou digite 2 para encerrar os votos"));
			
			if (opMesario == 1) {
				opVoto = Integer.valueOf(JOptionPane.showInputDialog("Codigo: 1 Nome: Angela Pepino Partido: PMDB - Nome: Gean da Silva Partido: PT - "
						+ "Codigo: 3 Nome: Cesar Souza Neto Partido: DEM - Codigo: 4 Nome: Voto Nulo - Codigo: 5 Nome: Voto em Branco"));
				if (opVoto == 1) {
					totalVotosAngela++;
				}
				else if (opVoto == 2) {
					totalVotosGean++;
				}
				else if (opVoto == 3) {
					totalVotosCesar++;
				}
				else if (opVoto == 4) {
					totalVotosNulo++;
				}
				else if (opVoto == 5) {
					totalVotosBranco++;
				}
				else {
					System.out.println("Voto invalido!!!");
				}
			}
			else if (opMesario == 2) {
				System.out.println("Elecoes encerradas!!!");
			}
			else {
				System.out.println("Opcao invalida!");
			}
			
		} while (opMesario != 2);
		
		
		
		System.out.println("Total de votos das eleicoes " + (totalVotosAngela+totalVotosGean+totalVotosCesar+totalVotosNulo+totalVotosBranco));
		
		System.out.println("Votos da Angela: " + totalVotosAngela);
		System.out.println("Votos da Gean: " + totalVotosGean);
		System.out.println("Votos da Cesar: " + totalVotosCesar);
		System.out.println("Votos da Nulo: " + totalVotosNulo);
		System.out.println("Votos da Branco: " + totalVotosBranco);
		
	}

}
