package com.example.recyclevieweventos;

public class Evento {
	
	String id, prioridade, descricao, categoria;
	int imgPrioridade;
	
	public Evento(String id, int imgPrioridade, String prioridade, String descricao, String categoria){
		this.id = id;
		this.imgPrioridade = imgPrioridade;
		this.prioridade = prioridade;
		this.descricao = descricao;
		this.categoria = categoria;
	}
	
	public String getId() {
		return id;
	}
	
	public int getImgPrioridade() {
		return imgPrioridade;
	}
	
	public String getPrioridade() {
		return prioridade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
}