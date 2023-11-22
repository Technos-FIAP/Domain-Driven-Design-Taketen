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

import br.com.taketen.beans.HistoricoSaude;
import br.com.taketen.bo.HistoricoSaudeBO;

@Path("/historicoSaude")
public class HistoricoSaudeResource {

private HistoricoSaudeBO historicoSaudeBO = new HistoricoSaudeBO();	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<HistoricoSaude> buscar() throws SQLException, ClassNotFoundException {
		return (ArrayList<HistoricoSaude>) historicoSaudeBO.secionarBo();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (HistoricoSaude historicoSaude, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		historicoSaudeBO.inserirBo(historicoSaude);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(historicoSaude.getIdHistoricoSaude()));
		return Response.created(builder.build()).build();		
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs (HistoricoSaude historicoSaude, @PathParam("id") int id) throws SQLException, ClassNotFoundException {
		historicoSaudeBO.atualizarBo(historicoSaude);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteRs (@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		historicoSaudeBO.deletarBo(id);
		return Response.ok().build();
	}
	
}
