package br.com.taketen.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.taketen.beans.Desafio;
import br.com.taketen.dao.DesafioDAO;

public class DesafioBO {

	DesafioDAO desafioDao;

	// Selecionar
	public ArrayList<Desafio> secionarBo() throws SQLException, ClassNotFoundException {
		desafioDao = new DesafioDAO();
		return (ArrayList<Desafio>) desafioDao.selecionar();
	}

	public void inserirBo(Desafio desafio) throws ClassNotFoundException, SQLException {
		DesafioDAO desafioDao = new DesafioDAO();
		desafioDao.inserir(desafio);
	}

	public void atualizarBo(Desafio desafio) throws ClassNotFoundException, SQLException {
		DesafioDAO desafioDao = new DesafioDAO();
		desafioDao.atualizar(desafio);
	}

	public void deletarBo(int id) throws ClassNotFoundException, SQLException {
		DesafioDAO desafioDao = new DesafioDAO();
		desafioDao.deletar(id);
	}

}
