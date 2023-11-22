package br.com.taketen.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conquista {

	private int idConquista, idSessaoGinastica, idDesafio, numeroPontuacaoConquista;
	private String descricaoConquista, numeroConquista, descricaoTipoConquista;
	private double numeroProgressoAtual;
	
	public Conquista() {
		super();
	}

	public Conquista(int idConquista, int idSessaoGinastica, int idDesafio, int numeroPontuacaoConquista,
			String descricaoConquista, String numeroConquista, String descricaoTipoConquista,
			double numeroProgressoAtual) {
		super();
		this.idConquista = idConquista;
		this.idSessaoGinastica = idSessaoGinastica;
		this.idDesafio = idDesafio;
		this.numeroPontuacaoConquista = numeroPontuacaoConquista;
		this.descricaoConquista = descricaoConquista;
		this.numeroConquista = numeroConquista;
		this.descricaoTipoConquista = descricaoTipoConquista;
		this.numeroProgressoAtual = numeroProgressoAtual;
	}

	public int getIdConquista() {
		return idConquista;
	}

	public int getIdSessaoGinastica() {
		return idSessaoGinastica;
	}

	public int getIdDesafio() {
		return idDesafio;
	}

	public int getNumeroPontuacaoConquista() {
		return numeroPontuacaoConquista;
	}

	public String getDescricaoConquista() {
		return descricaoConquista;
	}

	public String getNumeroConquista() {
		return numeroConquista;
	}

	public String getDescricaoTipoConquista() {
		return descricaoTipoConquista;
	}

	public double getNumeroProgressoAtual() {
		return numeroProgressoAtual;
	}

	public void setIdConquista(int idConquista) {
		this.idConquista = idConquista;
	}

	public void setIdSessaoGinastica(int idSessaoGinastica) {
		this.idSessaoGinastica = idSessaoGinastica;
	}

	public void setIdDesafio(int idDesafio) {
		this.idDesafio = idDesafio;
	}

	public void setNumeroPontuacaoConquista(int numeroPontuacaoConquista) {
		this.numeroPontuacaoConquista = numeroPontuacaoConquista;
	}

	public void setDescricaoConquista(String descricaoConquista) {
		this.descricaoConquista = descricaoConquista;
	}

	public void setNumeroConquista(String numeroConquista) {
		this.numeroConquista = numeroConquista;
	}

	public void setDescricaoTipoConquista(String descricaoTipoConquista) {
		this.descricaoTipoConquista = descricaoTipoConquista;
	}

	public void setNumeroProgressoAtual(double numeroProgressoAtual) {
		this.numeroProgressoAtual = numeroProgressoAtual;
	}
	
	
}
