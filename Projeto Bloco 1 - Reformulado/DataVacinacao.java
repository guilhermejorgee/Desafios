package br.com.eu.matriz;

import java.util.Random;
import java.util.Scanner;

public class DataVacinacao extends Atributos {
	
	void gerarData() {
	
	Scanner ler = new Scanner(System.in);
	
	DefinicaoPrioridade prioridade = new DefinicaoPrioridade();
	
	
	Random gerando = new Random();
	
	
	System.out.println("\nInforme quantas pessoas serão cadastradas");
	System.out.print("\nDigite: ");
	int pessoas = ler.nextInt();
	
	String[][] matriz = new String[pessoas][8];
	
	int qtd = 1;
			
	for(int i = 0; i<matriz.length; i++){		
		
	System.out.println("\n"+qtd++ +"º" + " Cadastro");
		
		for(int c = 0; c<4; c++) {
			
			if(c == 0) {
				ler.nextLine();
				System.out.println("\nInforme o nome para identificação");
				System.out.print("\nDigite: ");
				super.setNome(ler.nextLine());
				
				matriz[i][c] = super.getNome();
				
			}
			else if(c == 1){
				
				System.out.println("\nInforme a idade");
				System.out.print("\nDigite: ");
				super.setIdade(ler.nextInt());
				String idadeConvertida = Integer.toString(super.getIdade());
				matriz[i][c] = idadeConvertida;				
				matriz[i][4] = prioridade.PrioridadeIdade(matriz[i][c]);
					
			}
			else if(c == 2){
				
				System.out.println("\nAtua em uma dessas áreas?");
				System.out.println("\n[1]Área da Saúde\n[2]Motoristas/Cobrador\n[3]Profissional da Educação\n[4]Profissional da Segurança Pública"
						+ "\n[0]Outros ou Nenhum");
				System.out.print("\nDigite a opção que se adeque ao caso: ");	
				super.setProfissao(ler.nextInt());
				
				switch(super.getProfissao()) {
				case 1:
					matriz[i][c] = "Área da Saúde";	
					break;
				case 2:
					matriz[i][c] = "Motoristas/Cobrador";	
					break;
				case 3:
					matriz[i][c] = "Profissional da Educação";
					break;
				case 4:
					matriz[i][c] = "Profissional da Segurança Pública";
					break;
				default:
					matriz[i][c] = "Outros ou Nenhum";
				}	
									
				matriz[i][5] = prioridade.PrioridadeProfissao(matriz[i][c]);
			}
			else if(c == 3){
				
				System.out.println("\nPossui algumas dessas comorbidades/sindromes?");
				System.out.println("\n[1]Sindrome de Down\n[2]Problemas renais em diálise\n[3]Transplantados Imunossuprimidos\n[4]Grávidas e Puéperas com comorbidades\n[5]BPC\n[0]Outros ou Nenhum");
				System.out.print("\nDigite a opção que se adeque ao caso: ");
				super.setComorbidade(ler.nextInt());
				
				switch(super.getComorbidade()) {
				case 1:
					matriz[i][c] = "Sindrome de Down";	
					break;
				case 2:
					matriz[i][c] = "Problemas renais em diálise";	
					break;
				case 3:
					matriz[i][c] = "Transplantados Imunossuprimidos";
					break;
				case 4:
					matriz[i][c] = "Grávidas e Puéperas com comorbidades";
					break;
				case 5:
					matriz[i][c] = "BPC";
					break;
					
				default:
					matriz[i][c] = "Outros ou Nenhum";
				}	
				
				
				matriz[i][6] = prioridade.PrioridadeComorbidade(matriz[i][c]);
				
			}			
		
		}
		
	}
	
	for(int i = 0; i<matriz.length; i++){
		
		int verificPrioridade = 0;
		
		int idade = Integer.parseInt(matriz[i][4]);
		int profissao = Integer.parseInt(matriz[i][5]);
		int comorbidade = Integer.parseInt(matriz[i][6]);
		
		
		if(idade > profissao) {
			if(idade > comorbidade) {
				verificPrioridade = idade;
			}
			else {
				verificPrioridade = comorbidade;
			}
		}
		else if(profissao > comorbidade) {
			verificPrioridade = profissao;
		}
		else if(comorbidade > profissao) {
			verificPrioridade = comorbidade;
		}
		else {
			verificPrioridade = idade;
		}
		
		if(verificPrioridade == 5 || verificPrioridade == 4) {
			
			int dia = gerando.nextInt((30 - 1) + 1) + 1;
			int mes = gerando.nextInt((6 - 5) + 1) + 5;
			
			String toDia = Integer.toString(dia);
			
			String toMes = Integer.toString(mes);
			
			String data = toDia + "/" + toMes + "/" + "2021";
			
			matriz[i][7] = data;
			
		}
		else if(verificPrioridade == 3 || verificPrioridade == 2) {
			
			int dia = gerando.nextInt((30 - 1) + 1) + 1;
			int mes = gerando.nextInt((8 - 7) + 1) + 7;
			
			String toDia = Integer.toString(dia);
			
			String toMes = Integer.toString(mes);
			
			String data = toDia + "/" + toMes + "/" + "2021";
			
			matriz[i][7] = data;			
		}
		else if(verificPrioridade == 1) {
			
			int dia = gerando.nextInt((30 - 1) + 1) + 1;
			int mes = gerando.nextInt((10 - 9) + 1) + 9;
			
			String toDia = Integer.toString(dia);
			
			String toMes = Integer.toString(mes);
			
			String data = toDia + "/" + toMes + "/" + "2021";
			
			matriz[i][7] = data;			
		}
		else{
			
			int dia = gerando.nextInt((30 - 1) + 1) + 1;
			int mes = gerando.nextInt((12 - 11) + 1) + 11;
			
			String toDia = Integer.toString(dia);
			
			String toMes = Integer.toString(mes);
			
			String data = toDia + "/" + toMes + "/" + "2021";
			
			matriz[i][7] = data;			
		}				
	
	}
	
	for(int i = 0; i<matriz.length; i++) {
		
		System.out.println("\n\nData para vacinação de " + matriz[i][0] + " marcada para: "
				+ "\n" + matriz[i][7] );
		
	}
	

	}

}
