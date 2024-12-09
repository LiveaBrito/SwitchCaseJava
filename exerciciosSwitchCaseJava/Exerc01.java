package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		//Dia da semana
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 7: ");
		int numeroSemana = scan.nextInt();
		
		switch(numeroSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
			
		}

		scan.close();
	}

}
