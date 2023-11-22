package br.com.taketen.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.taketen.beans.Conquista;
import br.com.taketen.dao.ConquistaDAO;

public class ConquistaBO {
	
	ConquistaDAO conquistaDao;

	// Selecionar
	public ArrayList<Conquista> secionarBo() throws SQLException, ClassNotFoundException {
		conquistaDao = new ConquistaDAO();
		return (ArrayList<Conquista>) conquistaDao.selecionar();
	}

	public void inserirBo(Conquista conquista) throws ClassNotFoundException, SQLException {
		ConquistaDAO conquistaDao = new ConquistaDAO();
		conquistaDao.inserir(conquista);
	}

	public void atualizarBo(Conquista conquista) throws ClassNotFoundException, SQLException {
		ConquistaDAO conquistaDao = new ConquistaDAO();
		conquistaDao.atualizar(conquista);
	}

	public void deletarBo(int id) throws ClassNotFoundException, SQLException {
		ConquistaDAO conquistaDao = new ConquistaDAO();
		conquistaDao.deletar(id);
	}

}
