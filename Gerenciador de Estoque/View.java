package br.com.guilherme.gerenciaestoque;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		
		Scanner entrada = new Scanner(System.in);
		
		char verificador = 7;
		
		do {
			System.out.println("__________________________________________________");
			System.out.println("\n********[GERENCIADOR DE ESTOQUE]********");
			System.out.println("\nMenu Principal\n\n[1]Adicionar Material\n[2]Atualizar Material\n[3]Excluir Material\n[4]Visualizar Materiais\n[5]Sair");
			System.out.print("\nDigite a opção deseja: ");
			char opcao = entrada.next().charAt(0);
			
			switch(opcao) {
				
			case '1':
				
				estoque.novoMaterial();
				break;

			case '2':
			
				estoque.atualizarMaterial();
				break;
				
			case '3':
				
				estoque.excluirMaterial();
				break;
			
			case '4':
				
				estoque.exibirMateriais();
				break;
				
			case '5':
				
				verificador = 6;
				break;
			
		}
		}
		while(verificador != 6);
		
		entrada.close();
	}

}
