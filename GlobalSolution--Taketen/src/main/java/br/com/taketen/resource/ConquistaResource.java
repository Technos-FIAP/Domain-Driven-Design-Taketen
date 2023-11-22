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

import br.com.taketen.beans.Conquista;
import br.com.taketen.bo.ConquistaBO;

@Path("/conquista")
public class ConquistaResource {

private ConquistaBO conquistaBO = new ConquistaBO();	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Conquista> buscar() throws SQLException, ClassNotFoundException {
		return (ArrayList<Conquista>) conquistaBO.secionarBo();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (Conquista conquista, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		conquistaBO.inserirBo(conquista);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(conquista.getIdConquista()));
		return Response.created(builder.build()).build();		
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs (Conquista conquista, @PathParam("id") int id) throws SQLException, ClassNotFoundException {
		conquistaBO.atualizarBo(conquista);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteRs (@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		conquistaBO.deletarBo(id);
		return Response.ok().build();
	}
	
}
