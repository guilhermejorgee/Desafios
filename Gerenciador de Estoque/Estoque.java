package br.com.guilherme.gerenciaestoque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Estoque extends Materiais implements EstoqueInterface {
	
	ArrayList<Integer> codigo = new ArrayList<>();
	ArrayList<String> nome = new ArrayList<>();
	ArrayList<Integer> qtdEstoque = new ArrayList<>();
	ArrayList<Double> valor = new ArrayList<>();
	
	Scanner entrada = new Scanner(System.in);

	@Override
	public void novoMaterial() {
			
	System.out.println("__________________________________________________");	
	System.out.println("\n********[ADICIONAR MATERIAL]********");
	
	System.out.println("\nInforme o código do material");
	System.out.print("Código: ");	
	int testeCodigo = entrada.nextInt();
		
	if(codigo.contains(testeCodigo)) {
		System.out.println("\nEste código já existe, digite um novo");
	}
	else {
		super.setCodigo(testeCodigo);	
		codigo.add(super.getCodigo());
		
		entrada.nextLine();
		System.out.println("\nInforme o nome do material");
		System.out.print("Nome: ");
		super.setNome(entrada.nextLine());
		nome.add(super.getNome());
		
		System.out.println("\nInforme a quantidade inicial em estoque do material");
		System.out.print("Quantidade: ");
		super.setEstoque(entrada.nextInt());
		qtdEstoque.add(super.getEstoque());
		
		System.out.println("\nInforme o valor do material");
		System.out.print("Valor: ");
		super.setValor(entrada.nextDouble());
		valor.add(super.getValor());
		
		}	
		
	}

	@Override
	public void atualizarMaterial() {
		
		Iterator<Integer> iCodigo =	codigo.iterator();	
		
		System.out.println("__________________________________________________");
		System.out.println("\n********[ATUALIZAR MATERIAL]********");	
		
		System.out.println("\nInforme o código do material que deseja atualizar");
		System.out.print("\nDigite o código: ");
		int codigoDigitado = entrada.nextInt();
	
	
		if(codigo.contains(codigoDigitado)) {
	
		for(int i = 0; i < codigo.size(); i++) {
		
			if(iCodigo.next() == codigoDigitado) {
							
			char verificadorLoopMenu = 7;
				
			do {
				
				System.out.println("\nEscolha o que deseja atualiazr\n\n[1]Alterar código\n[2]Alterar Nome\n[3]Alterar Estoque\n[4]Alterar Valor\n[5]Sair");
				System.out.print("\nDigite a opção desejada: ");
				char opcao = entrada.next().charAt(0);
				
				switch(opcao) {
				case '1':					
					
					System.out.print("\nDigite o novo código: ");
					int testeCodigo = entrada.nextInt();
					
					if(codigo.contains(testeCodigo)) {
						System.out.println("\nEste código já existe, digite um novo");
					}
					else {
						super.setCodigo(testeCodigo);
						codigo.set(i, super.getCodigo());
					}
					
					break;
					
				case '2':
					
					entrada.nextLine();
					System.out.print("\nDigite o novo nome: ");
					super.setNome(entrada.nextLine());
					nome.set(i, super.getNome());	
					
					break;
					
				case '3':
					
					System.out.print("\nDigite o novo estoque: ");
					super.setEstoque(entrada.nextInt());
					qtdEstoque.set(i, super.getEstoque());	
					
					break;
				case '4':
					
					System.out.print("\nDigite o novo valor: ");
					super.setValor(entrada.nextDouble());
					valor.set(i, super.getValor());
					
					break;
				case '5':
					verificadorLoopMenu = 6;
					i = codigo.size();
					break;
				}
				
			}
			while(verificadorLoopMenu != 6);			
			
			}
	
		}

		}
		else {
			System.out.println("\nCódigo não encontrado");
		}
	}
	


	@Override
	public void exibirMateriais() {
	
		System.out.println("__________________________________________________");
		System.out.println("\n********[MATERIAIS CADASTRADOS]********");	
		
		for(int i = 0; i < codigo.size(); i++) {
			
			System.out.println("\nCódigo: " + codigo.get(i) + " | Nome: " + nome.get(i) + " | Estoque: " + qtdEstoque.get(i) + " | Valor: " + valor.get(i));
		}
		
				
	}

	@Override
	public void excluirMaterial() {
		
Iterator<Integer> iCodigo =	codigo.iterator();	
		
		System.out.println("__________________________________________________");
		System.out.println("\n********[EXCLUIR MATERIAL]********");	
		
		System.out.println("\nInforme o código do material que deseja retirar");
		System.out.print("\nDigite o código: ");
		int codigoDigitado = entrada.nextInt();
	
	
		if(codigo.contains(codigoDigitado)) {
	
		for(int i = 0; i < codigo.size(); i++) {
		
			if(iCodigo.next() == codigoDigitado) {
							
				codigo.remove(i);
				nome.remove(i);
				qtdEstoque.remove(i);
				valor.remove(i);
				
				System.out.println("\nMaterial Excluído");
			
			}
	
		}

		}
		else {
			System.out.println("\nCódigo não encontrado");
		}

		
		
	}

}
