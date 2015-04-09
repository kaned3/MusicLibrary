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
import dit.dss.services.UserServiceLocal;

@Path("/user")
public class UserREST {
	
	@EJB
	private UserServiceLocal service;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("id") Integer id){
		return service.getUserById(id);
	}
	
	@POST
	@Path("/add/{id}/{username}/{password}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUser(@PathParam("id") Integer id, @PathParam("username") String username, @PathParam("password") String password) {
		User user = new User(id, username, password);
		service.addUser(user);
	}

	public void editUser(User user) {
		
	}

	public void removeUser(User user) {
		
	}

	public void assignUserToLibrary(User user, Library library) {
		
	}
}
