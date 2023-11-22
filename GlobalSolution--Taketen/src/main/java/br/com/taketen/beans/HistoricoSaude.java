package br.com.taketen.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HistoricoSaude {

	private int idHistoricoSaude, idUsuario;
	private String dataRegistro, descricaoEstresse, descricaoPostura;
	private double numeroHorasSedentarias;
	private String descricaoLesoes;
	
	public HistoricoSaude() {
		super();
	}
	
	public HistoricoSaude(int idHistoricoSaude, int idUsuario, String dataRegistro, String descricaoEstresse,
			String descricaoPostura, double numeroHorasSedentarias, String descricaoLesoes) {
		super();
		this.idHistoricoSaude = idHistoricoSaude;
		this.idUsuario = idUsuario;
		this.dataRegistro = dataRegistro;
		this.descricaoEstresse = descricaoEstresse;
		this.descricaoPostura = descricaoPostura;
		this.numeroHorasSedentarias = numeroHorasSedentarias;
		this.descricaoLesoes = descricaoLesoes;
	}

	public int getIdHistoricoSaude() {
		return idHistoricoSaude;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getDataRegistro() {
		return dataRegistro;
	}

	public String getDescricaoEstresse() {
		return descricaoEstresse;
	}

	public String getDescricaoPostura() {
		return descricaoPostura;
	}

	public double getNumeroHorasSedentarias() {
		return numeroHorasSedentarias;
	}

	public String getDescricaoLesoes() {
		return descricaoLesoes;
	}

	public void setIdHistoricoSaude(int idHistoricoSaude) {
		this.idHistoricoSaude = idHistoricoSaude;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public void setDescricaoEstresse(String descricaoEstresse) {
		this.descricaoEstresse = descricaoEstresse;
	}

	public void setDescricaoPostura(String descricaoPostura) {
		this.descricaoPostura = descricaoPostura;
	}

	public void setNumeroHorasSedentarias(double numeroHorasSedentarias) {
		this.numeroHorasSedentarias = numeroHorasSedentarias;
	}

	public void setDescricaoLesoes(String descricaoLesoes) {
		this.descricaoLesoes = descricaoLesoes;
	}
	
	
	
	
}
