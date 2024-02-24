package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media;

		//PERGUNTANDO O NUMERO DE ALUNOS PARA ESTABELECER O PARAMETRO DE REPETIÇÂO E CRIANDO A VAR DA NOTA MEDIA
		System.out.println("Quantos alunos irão ser analisados? ");
		int vezes = sc.nextInt();
		

		//CRIANDO AS ARRAYS (NOME DO ALUNO, NOTA DO PRIMEIRO SEMESTRE E NOTA DO SEGUNDO SEMESTRE)
		String[] nomes = new String[vezes];
		double[] notas1 = new double[vezes];
		double[] notas2 = new double[vezes];

		//CRIAR FOR PARA REPETIR A PERGUNTA
		for (int i=0; i<vezes; i++) {
			System.out.println("Nome do aluno: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.println("Nota primeiro semestre: ");
			notas1[i] = sc.nextDouble();
			System.out.println("Notas segundo semestre: ");
			notas2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");
		//PEGANDO A MEDIA DAS NOTAS DOS ALUNOS
		for (int i=0; i<vezes; i++) {
			media = (notas1[i] + notas2[i]) / 2;

			//IF PARA SABER SE O ALUNO PASSOU O NÃO
			if(media > 6.0) {
	            System.out.printf("%s\n", nomes[i]);
	        }
		}

		sc.close();
	}

}
