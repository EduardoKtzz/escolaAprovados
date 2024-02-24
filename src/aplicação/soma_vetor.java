package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
	public static void main(String[] args) {

		//CONFIGURAÇÔES INICIAIS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PERGUNTANDO QUANTAS VEZES IRA SE REPETIR E CIRANDO UMA ARRAY
		System.out.println("Quantos números você vai digitar? ");
		int vezes = sc.nextInt();
		double[] numeros = new double[vezes];

		//CRIANDO O SISTEMA DE REPETIÇÂO PARA PEGAR TODOS OS NÚMEROS
		for (int i=0; i<vezes; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}

		//ESCREVENDO TODOS OS VALORES OBTIDOS NA TELA
		System.out.print("VALORES = ");
	    for (int i=0; i<vezes; i++) {
	    	System.out.printf("%.1f  ", numeros[i]);
	    }

		//CRIANDO O SISTEMA DE REPETIÇÂO PARA CONSEGUIR A SOMA DE TODOS OS NUMEROS
		double soma = 0;
		for (int i=0; i<vezes; i++) {
			soma = soma + numeros[i];
		}

		//PEGANDO MEDIA DE TODOS OS NUMEROS
		double media = soma / vezes;

		//RESULTADOS FINAIS
		System.out.println();
		System.out.printf("SOMA TOTAL: %.1f ", soma);
		System.out.println();
		System.out.printf("MEDIA: %.1f ", media);

		sc.close();
	}
}
