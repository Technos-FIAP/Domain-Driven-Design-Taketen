package br.com.taketen.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Chatbot {

	private int idChatbot, idUsuario;
	private String textoEntrada, textoSaida, dataMensagem, descricaoIntencao;
	
	public Chatbot() {
		super();
	}

	public Chatbot(int idChatbot, int idUsuario, String textoEntrada, String textoSaida, String dataMensagem,
			String descricaoIntencao) {
		super();
		this.idChatbot = idChatbot;
		this.idUsuario = idUsuario;
		this.textoEntrada = textoEntrada;
		this.textoSaida = textoSaida;
		this.dataMensagem = dataMensagem;
		this.descricaoIntencao = descricaoIntencao;
	}

	public int getIdChatbot() {
		return idChatbot;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getTextoEntrada() {
		return textoEntrada;
	}

	public String getTextoSaida() {
		return textoSaida;
	}

	public String getDataMensagem() {
		return dataMensagem;
	}

	public String getDescricaoIntencao() {
		return descricaoIntencao;
	}

	public void setIdChatbot(int idChatbot) {
		this.idChatbot = idChatbot;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setTextoEntrada(String textoEntrada) {
		this.textoEntrada = textoEntrada;
	}

	public void setTextoSaida(String textoSaida) {
		this.textoSaida = textoSaida;
	}

	public void setDataMensagem(String dataMensagem) {
		this.dataMensagem = dataMensagem;
	}

	public void setDescricaoIntencao(String descricaoIntencao) {
		this.descricaoIntencao = descricaoIntencao;
	}

	
	
}
