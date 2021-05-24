package br.com.eu.matriz;

public class DefinicaoPrioridade {
	
	String PrioridadeIdade(String idade) {
		
		int conversao = Integer.parseInt(idade);	
		char prioridade = 0;
		
		if(conversao >=18 && conversao <=25) {
			prioridade = 0;	
		}
		else if(conversao >=26 && conversao <=33) {
			prioridade = 1;	
		}
		else if(conversao >=34 && conversao <=41) {
			prioridade = 2;	
		}
		else if(conversao >=42 && conversao <=49) {
			prioridade = 3;	
		}
		else if(conversao >=50 && conversao <=57) {
			prioridade = 4;	
		}
		else if(conversao >=58 && conversao <=65) {
			prioridade = 5;	
		}
		
		String resultado = Integer.toString(prioridade);	
		
		return resultado;
	}
	
	String PrioridadeProfissao(String profissao) {	
		
		//int conversao = Integer.parseInt(profissao);	
		
		char prioridade = 0;
		
		if(profissao == "Outros ou Nenhum") {
			prioridade = 0;	
		}
		else if(profissao == "Profissional da Segurança Pública") {
			prioridade = 2;	
		}
		else if(profissao == "Profissional da Educação") {
			prioridade = 3;	
		}
		else if(profissao == "Motoristas/Cobrador") {
			prioridade = 4;	
		}
		else if(profissao == "Área da Saúde") {
			prioridade = 5;	
		}

		String resultado = Integer.toString(prioridade);	
		
		return resultado;
	}	

	String PrioridadeComorbidade(String comorbidade) {	
		
		//int conversao = Integer.parseInt(comorbidade);
		
		char prioridade = 0;
		
		if(comorbidade == "Outros ou Nenhum") {
			prioridade = 0;	
		}
		else if(comorbidade == "Sindrome de Down") {
			prioridade = 1;	
		}
		else if(comorbidade == "BPC") {
			prioridade = 2;	
		}
		else if(comorbidade == "Grávidas e Puéperas com comorbidades") {
			prioridade = 3;	
		}
		else if(comorbidade == "Transplantados Imunossuprimidos") {
			prioridade = 4;	
		}
		else if(comorbidade == "Problemas renais em diálise") {
			prioridade = 5;	
		}
		
		String resultado = Integer.toString(prioridade);	
		
		return resultado;
	}	

}
