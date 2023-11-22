package br.com.taketen.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TipoExercicio {

	private int idTipoExercicio;
	private String numeroTipoExercicio, descricaoTipoExercicio;
	
	public TipoExercicio() {
		super();
	}

	public TipoExercicio(int idTipoExercicio, String numeroTipoExercicio, String descricaoTipoExercicio) {
		super();
		this.idTipoExercicio = idTipoExercicio;
		this.numeroTipoExercicio = numeroTipoExercicio;
		this.descricaoTipoExercicio = descricaoTipoExercicio;
	}

	public int getIdTipoExercicio() {
		return idTipoExercicio;
	}

	public String getNumeroTipoExercicio() {
		return numeroTipoExercicio;
	}

	public String getDescricaoTipoExercicio() {
		return descricaoTipoExercicio;
	}

	public void setIdTipoExercicio(int idTipoExercicio) {
		this.idTipoExercicio = idTipoExercicio;
	}

	public void setNumeroTipoExercicio(String numeroTipoExercicio) {
		this.numeroTipoExercicio = numeroTipoExercicio;
	}

	public void setDescricaoTipoExercicio(String descricaoTipoExercicio) {
		this.descricaoTipoExercicio = descricaoTipoExercicio;
	}
	
	
	
}
