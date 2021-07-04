package br.com.alura.loja;

import java.math.BigDecimal;

import com.thoughtworks.xstream.converters.basic.BigDecimalConverter;

public class Produto {
	
	private String nome;
	private BigDecimal preco;
	
	public Produto(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}

}
