package br.com.taketen.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SessaoGinasticaExercicio {

	private int idSessaoGinasticaExercicio, idExercicio, idSessaoGinastica;

	public SessaoGinasticaExercicio() {
		super();
	}

	public SessaoGinasticaExercicio(int idSessaoGinasticaExercicio, int idExercicio, int idSessaoGinastica) {
		super();
		this.idSessaoGinasticaExercicio = idSessaoGinasticaExercicio;
		this.idExercicio = idExercicio;
		this.idSessaoGinastica = idSessaoGinastica;
	}

	public int getIdSessaoGinasticaExercicio() {
		return idSessaoGinasticaExercicio;
	}

	public int getIdExercicio() {
		return idExercicio;
	}

	public int getIdSessaoGinastica() {
		return idSessaoGinastica;
	}

	public void setIdSessaoGinasticaExercicio(int idSessaoGinasticaExercicio) {
		this.idSessaoGinasticaExercicio = idSessaoGinasticaExercicio;
	}

	public void setIdExercicio(int idExercicio) {
		this.idExercicio = idExercicio;
	}

	public void setIdSessaoGinastica(int idSessaoGinastica) {
		this.idSessaoGinastica = idSessaoGinastica;
	}
	
	
	
}
