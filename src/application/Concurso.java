package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Concurso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int N = sc.nextInt();

		Pessoa[] pessoas = new Pessoa[N];
		for (int i = 0; i < N; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Informe os dados da pessoa " + (i + 1) + " :");

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Nota da etapa 1: ");
			double notaEtapa1 = sc.nextDouble();

			System.out.print("Nota da etapa 2: ");
			double notaEtapa2 = sc.nextDouble();

			pessoas[i] = new Pessoa(nome, notaEtapa1, notaEtapa2);

		}

		System.out.println("\nTABELA:");
		System.out.println("Nome\t\tNota Etapa 1\tNota Etapa 2\tMédia");

		int quantidadeAprovados = 0;
		double maiorMedia = 0.0;
		String pessoaMaiorMedia = "";
		double somaMediasAprovados = 0.0;

		for (int i = 0; i < N; i++) {
			double media = (pessoas[i].getNotaEtapa1() + pessoas[i].getNotaEtapa2()) / 2;
			System.out.printf("%-10s\t%.2f\t\t%.2f\t\t%.2f\n", pessoas[i].getNome(), pessoas[i].getNotaEtapa1(),
					pessoas[i].getNotaEtapa2(), media);

			if (media >= 70) {
				quantidadeAprovados++;
				somaMediasAprovados += media;}

				if (media > maiorMedia) {
					maiorMedia = media;
					pessoaMaiorMedia = pessoas[i].getNome();
				}
											
			
		}

		System.out.println("\nPESSOAS APROVADAS:");

		for (int i = 0; i < N; i++) {
			double media = (pessoas[i].getNotaEtapa1() + pessoas[i].getNotaEtapa2()) / 2;
			if (media >= 70) {
				System.out.println(pessoas[i].getNome());
			}
		}

		double porcentagemAprovacao = (double) quantidadeAprovados / N * 100;

		System.out.printf("\nPorcentagem de aprovação: %.2f%%\n", porcentagemAprovacao);

		if (quantidadeAprovados > 0) {
			System.out.println("Maior média: " + pessoaMaiorMedia);
			System.out.printf("Nota média dos aprovados: %.2f\n", somaMediasAprovados / quantidadeAprovados);
		} 
		if ( quantidadeAprovados <= 0) {
			
			System.out.println("Maior média: " + pessoaMaiorMedia);
			System.out.println("Não há candidatos aprovados.");
		}

		sc.close();
	}

}
