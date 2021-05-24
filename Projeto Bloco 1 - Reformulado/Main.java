package br.com.eu.matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		DataVacinacao data = new DataVacinacao();
		
		TriagemVirtual triagem = new TriagemVirtual();
		
		Atributos atributos = new Atributos();
		
		Scanner entrada = new Scanner(System.in);
		
		int verificacao = 1;
		
		System.out.println("Olá, Bem vindo ao Sistema Project Vac");
		
		do {
		
		System.out.println("\nVocê deseja cadastrar a data de vacinação"
				+ "\nou realizar triagem dos sintomas para covid19?\n\n[1]Data de Vacinação\n[2]Triagem\n[3]Para Sair");
		System.out.print("\nDigite: ");
		char opcao = entrada.next().charAt(0);
		
		switch(opcao) {
		case '1':
			data.gerarData();
			verificacao = 1;
			break;
		case '2':
			triagem.processoTriagem();
			verificacao = 1;
			break;
		case '3':
			System.out.println("\nPrograma Encerrado");
			verificacao = 1;
			break;
		default:
			System.out.println("\nDigite uma opção válida");
			verificacao = 0;
		}
		
		
		}
		while(verificacao != 1);
		
		//data.gerarData();
		
		
		//triagem.processoTriagem();
		
	}

}
