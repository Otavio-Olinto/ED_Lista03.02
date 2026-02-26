/*
 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 
 * 10 a 999999 e recebendo um 2º número inteiro (de 0 a 9), tenha uma função recursiva que
 * apresente quantas vezes o 2º número aparece no primeiro.  
 */

package view;

import java.util.Scanner;
import controller.NumeroPresente;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe NumeroPresente
		NumeroPresente metodo = new NumeroPresente();
		
		// Criando o método de leitura com o Scanner
		Scanner ler = new Scanner(System.in);
		
		int numAnalisado = -1, numRequerido = -1;
		
		do {
			System.out.print("Digite o número a ser analisado que seja de 10 a 999999: ");
			numAnalisado = Integer.parseInt(ler.nextLine());
		}while(numAnalisado<10||numAnalisado>=1000000);
		
		do {
			System.out.print("Digite o número que deseja que seja de 0 a 9: ");
			numRequerido = Integer.parseInt(ler.nextLine());
		}while(numRequerido<0||numRequerido>=10);
		
		System.out.println("Há "+metodo.quantidade(numAnalisado, numRequerido)+" números "+
							numRequerido+" em "+numAnalisado);
		
		ler.close();
	}

}
