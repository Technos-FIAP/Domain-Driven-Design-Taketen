package br.com.taketen.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profissao {

	private int idProfissao, idUsuario;
	private String descricaoProfissao, descricaoNivelAtividadeFisica, descricaoEstresseOcupacional;
	private double numeroFrequenciaPausaAtiva;
	
	public Profissao() {
		super();
	}

	public Profissao(int idProfissao, int idUsuario, String descricaoProfissao, String descricaoNivelAtividadeFisica,
			String descricaoEstresseOcupacional, double numeroFrequenciaPausaAtiva) {
		super();
		this.idProfissao = idProfissao;
		this.idUsuario = idUsuario;
		this.descricaoProfissao = descricaoProfissao;
		this.descricaoNivelAtividadeFisica = descricaoNivelAtividadeFisica;
		this.descricaoEstresseOcupacional = descricaoEstresseOcupacional;
		this.numeroFrequenciaPausaAtiva = numeroFrequenciaPausaAtiva;
	}

	public int getIdProfissao() {
		return idProfissao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getDescricaoProfissao() {
		return descricaoProfissao;
	}

	public String getDescricaoNivelAtividadeFisica() {
		return descricaoNivelAtividadeFisica;
	}

	public String getDescricaoEstresseOcupacional() {
		return descricaoEstresseOcupacional;
	}

	public double getNumeroFrequenciaPausaAtiva() {
		return numeroFrequenciaPausaAtiva;
	}

	public void setIdProfissao(int idProfissao) {
		this.idProfissao = idProfissao;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setDescricaoProfissao(String descricaoProfissao) {
		this.descricaoProfissao = descricaoProfissao;
	}

	public void setDescricaoNivelAtividadeFisica(String descricaoNivelAtividadeFisica) {
		this.descricaoNivelAtividadeFisica = descricaoNivelAtividadeFisica;
	}

	public void setDescricaoEstresseOcupacional(String descricaoEstresseOcupacional) {
		this.descricaoEstresseOcupacional = descricaoEstresseOcupacional;
	}

	public void setNumeroFrequenciaPausaAtiva(double numeroFrequenciaPausaAtiva) {
		this.numeroFrequenciaPausaAtiva = numeroFrequenciaPausaAtiva;
	}
	
}
