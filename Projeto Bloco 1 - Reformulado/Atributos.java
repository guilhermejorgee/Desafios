package br.com.eu.matriz;

public class Atributos {
	
	// Geral
	String nome;
	int comorbidade;
	
	// Data
	int idade;
	int Profissao;
	
	
	//Triagem
	int febre;
	int respiratorio;
	int outros;
	
		
	public int getFebre() {
		return febre;
	}
	public void setFebre(int febre) {
		this.febre = febre;
	}
	public int getRespiratorio() {
		return respiratorio;
	}
	public void setRespiratorio(int respiratorio) {
		this.respiratorio = respiratorio;
	}
	public int getOutros() {
		return outros;
	}
	public void setOutros(int outros) {
		this.outros = outros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getProfissao() {
		return Profissao;
	}
	public void setProfissao(int profissao) {
		Profissao = profissao;
	}
	public int getComorbidade() {
		return comorbidade;
	}
	public void setComorbidade(int comorbidade) {
		this.comorbidade = comorbidade;
	}
	
	

}
