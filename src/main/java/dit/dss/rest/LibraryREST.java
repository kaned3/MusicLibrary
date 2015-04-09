package dit.dss.rest;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dit.dss.entities.Library;
import dit.dss.entities.User;
import dit.dss.services.LibraryServiceLocal;

@Path("/library")
public class LibraryREST {

	@EJB
	private LibraryServiceLocal service;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Library> getAllLibraries(){
		return service.getAllLibraries();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Library getLibraryById(@PathParam("id") Integer id){
		return service.getLibraryById(id);
	}
	
	@POST
	@Path("/add/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addLibrary(@PathParam("id") Integer id) {
		Library library = new Library(id);
		service.addLibrary(library);
	}

	public void editLibrary(Library library) {
		
	}

	public void removeLibrary(Library library) {
		
	}

	public void assignUserToLibrary(User user, Integer libraryId) {
		
	}

}
