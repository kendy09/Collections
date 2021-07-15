package Exericio1;

import java.util.ArrayList;
import java.util.Scanner;

import Colletctions02.Aluno;

public class Exercicio1 {
	public static void main(String[] args) {
		int resposta = 0;
		int  cont = -1;
		ArrayList<Estoque>Armazem = new ArrayList<>();
		do {
			Scanner read = new Scanner(System.in);
			System.out.println("Qual a marca do sapato");
			String marca = read.nextLine();
			System.out.println("Qual é o numero do sapato");
			int numero = read.nextInt();
			System.out.println("Quantidade a ser registrada");
			int quantidade = read.nextInt();
			System.out.println("O que você deseja fazer?\n"
					+ "1-Adicionar mais um calçado?\n"
					+ "2-Remover um calçado?\n"
					+ "3-Atualizar dados da lista?\n"
					+ "4-Finalizar programa");
			resposta = read.nextInt();
			
			switch(resposta) {
				case 1:
					Armazem.add(new Estoque(numero, marca, quantidade));
					break;
				case 2:
					Armazem.clear();
					break;
				case 3:
					Armazem.add(new Estoque(numero, marca, quantidade));
					for (Estoque e: Armazem ) {
						System.out.println(e);	
					}
					break;
				default:
					break;
			} 
		}while (resposta != 4);
		System.out.println("Programa finalizado");
	}
}
