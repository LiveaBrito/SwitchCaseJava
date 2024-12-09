package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		// Operadores (+, -, *, /)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite o operador (+, -, *, /): ");
		String operador = scan.next();
		
		switch (operador) {
		case "+":
			int resultado = numero1 + numero2; 
			System.out.println("Resultado da soma: " + resultado);
			break;
		case "-":
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
            break;
        case "*":
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);
            break;
        case "/":
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
            }
            break;
        default:
            System.out.println("Erro: Operador inválido.");
    }

    // Fechar o scanner
    scan.close();
		}

	}


