package br.com.taketen.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.taketen.beans.Profissao;
import br.com.taketen.dao.ProfissaoDAO;

public class ProfissaoBO {
	
	ProfissaoDAO profissaoDao;

	// Selecionar
	public ArrayList<Profissao> secionarBo() throws SQLException, ClassNotFoundException {
		profissaoDao = new ProfissaoDAO();
		return (ArrayList<Profissao>) profissaoDao.selecionar();
	}

	public void inserirBo(Profissao profissao) throws ClassNotFoundException, SQLException {
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		profissaoDao.inserir(profissao);
	}

	public void atualizarBo(Profissao profissao) throws ClassNotFoundException, SQLException {
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		profissaoDao.atualizar(profissao);
	}

	public void deletarBo(int id) throws ClassNotFoundException, SQLException {
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		profissaoDao.deletar(id);
	}

}
