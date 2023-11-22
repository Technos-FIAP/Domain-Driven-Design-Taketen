package br.com.taketen.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.taketen.beans.TipoExercicio;
import br.com.taketen.dao.TipoExercicioDAO;

public class TipoExercicioBO {
	
	TipoExercicioDAO tipoExercicioDao;

	// Selecionar
	public ArrayList<TipoExercicio> secionarBo() throws SQLException, ClassNotFoundException {
		tipoExercicioDao = new TipoExercicioDAO();
		return (ArrayList<TipoExercicio>) tipoExercicioDao.selecionar();
	}

	public void inserirBo(TipoExercicio tipoExercicio) throws ClassNotFoundException, SQLException {
		TipoExercicioDAO tipoExercicioDao = new TipoExercicioDAO();
		tipoExercicioDao.inserir(tipoExercicio);
	}

	public void atualizarBo(TipoExercicio tipoExercicio) throws ClassNotFoundException, SQLException {
		TipoExercicioDAO tipoExercicioDao = new TipoExercicioDAO();
		tipoExercicioDao.atualizar(tipoExercicio);
	}

	public void deletarBo(int id) throws ClassNotFoundException, SQLException {
		TipoExercicioDAO tipoExercicioDao = new TipoExercicioDAO();
		tipoExercicioDao.deletar(id);
	}

}
