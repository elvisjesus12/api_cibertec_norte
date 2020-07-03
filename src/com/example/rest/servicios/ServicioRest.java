package com.example.rest.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.example.rest.dao.TipoReclamoModel;

import com.example.rest.entidades.tiporeclamo;

@Path("/servicios")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class ServicioRest {
	private static final Log log = LogFactory.getLog(ServicioRest.class);

	private TipoReclamoModel daoTipoReclamo = new TipoReclamoModel();


	
	
	
	
	//crudTIporeclamo
	
	@GET
	@Path("/tiporeclamo")
	public Response listarTipoReclamoTodos() {
		log.info("listars marca rest ");
		return Response.ok(daoTipoReclamo.listarTipoReclamoTodos()).build();
	}

	@POST
	@Path("/tiporeclamo")
	public Response registraTipoReclamo(tiporeclamo obj) {
		log.info("Registra marca " + obj.getIdTipoReclamo());
		if (daoTipoReclamo.insertaTipoReclamo(obj) > 0)
			return Response.ok().build();
		else
			return Response.notModified().build();
	}

	@PUT
	@Path("/tiporeclamo")
	public Response atualizaTipoReclamo(tiporeclamo obj) {
		log.info("Actualiza marca " + obj.getIdTipoReclamo());
		if (daoTipoReclamo.actualizaTipoReclamo(obj) > 0)
			return Response.ok().build();
		else
			return Response.notModified().build();
	}

	@DELETE
	@Path("/tiporeclamo/{idTipoReclamo}")
	public Response eliminaTipoReclamo(@PathParam("idTipoReclamo") int id) {
		log.info("Elimina usuario " + id);
		if (daoTipoReclamo.eliminaTipoReclamo(id) > 0)
			return Response.ok().build();
		else
			return Response.notModified().build();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}