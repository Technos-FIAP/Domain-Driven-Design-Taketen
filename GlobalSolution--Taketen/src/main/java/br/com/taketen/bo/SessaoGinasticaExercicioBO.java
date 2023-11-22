package br.com.taketen.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.taketen.beans.SessaoGinasticaExercicio;
import br.com.taketen.dao.SessaoGinasticaExercicioDAO;

public class SessaoGinasticaExercicioBO {
	
	SessaoGinasticaExercicioDAO sessaoGinasticaExercicioDao;

	// Selecionar
	public ArrayList<SessaoGinasticaExercicio> secionarBo() throws SQLException, ClassNotFoundException {
		sessaoGinasticaExercicioDao = new SessaoGinasticaExercicioDAO();
		return (ArrayList<SessaoGinasticaExercicio>) sessaoGinasticaExercicioDao.selecionar();
	}

	public void inserirBo(SessaoGinasticaExercicio sessaoGinasticaExercicio) throws ClassNotFoundException, SQLException {
		SessaoGinasticaExercicioDAO sessaoGinasticaExercicioDao = new SessaoGinasticaExercicioDAO();
		sessaoGinasticaExercicioDao.inserir(sessaoGinasticaExercicio);
	}

	public void atualizarBo(SessaoGinasticaExercicio sessaoGinasticaExercicio) throws ClassNotFoundException, SQLException {
		SessaoGinasticaExercicioDAO sessaoGinasticaExercicioDao = new SessaoGinasticaExercicioDAO();
		sessaoGinasticaExercicioDao.atualizar(sessaoGinasticaExercicio);
	}

	public void deletarBo(int id) throws ClassNotFoundException, SQLException {
		SessaoGinasticaExercicioDAO sessaoGinasticaExercicioDao = new SessaoGinasticaExercicioDAO();
		sessaoGinasticaExercicioDao.deletar(id);
	}

}
