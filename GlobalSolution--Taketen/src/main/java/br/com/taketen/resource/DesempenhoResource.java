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

import br.com.taketen.beans.Desempenho;
import br.com.taketen.bo.DesempenhoBO;

@Path("/desempenho")
public class DesempenhoResource {

private DesempenhoBO desempenhoBO = new DesempenhoBO();	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Desempenho> buscar() throws SQLException, ClassNotFoundException {
		return (ArrayList<Desempenho>) desempenhoBO.secionarBo();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (Desempenho desempenho, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		desempenhoBO.inserirBo(desempenho);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(desempenho.getIdDesempenho()));
		return Response.created(builder.build()).build();		
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs (Desempenho desempenho, @PathParam("id") int id) throws SQLException, ClassNotFoundException {
		desempenhoBO.atualizarBo(desempenho);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteRs (@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		desempenhoBO.deletarBo(id);
		return Response.ok().build();
	}
	
}
