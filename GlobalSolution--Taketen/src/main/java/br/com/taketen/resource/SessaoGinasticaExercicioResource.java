package br.com.taketen.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.taketen.beans.SessaoGinasticaExercicio;
import br.com.taketen.bo.SessaoGinasticaExercicioBO;

@Path("/sessaoGinasticaExercicio")
public class SessaoGinasticaExercicioResource {

private SessaoGinasticaExercicioBO sessaoGinasticaExercicioBO = new SessaoGinasticaExercicioBO();	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<SessaoGinasticaExercicio> buscar() throws SQLException, ClassNotFoundException {
		return (ArrayList<SessaoGinasticaExercicio>) sessaoGinasticaExercicioBO.secionarBo();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (SessaoGinasticaExercicio SessaoGinasticaExercicio, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		sessaoGinasticaExercicioBO.inserirBo(SessaoGinasticaExercicio);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(SessaoGinasticaExercicio.getIdSessaoGinasticaExercicio()));
		return Response.created(builder.build()).build();		
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs (SessaoGinasticaExercicio sessaoGinasticaExercicio, @PathParam("id") int id) throws SQLException, ClassNotFoundException {
		sessaoGinasticaExercicioBO.atualizarBo(sessaoGinasticaExercicio);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteRs (@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		sessaoGinasticaExercicioBO.deletarBo(id);
		return Response.ok().build();
	}
	
}
