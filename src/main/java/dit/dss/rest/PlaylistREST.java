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

import dit.dss.entities.Playlist;
import dit.dss.entities.Track;
import dit.dss.services.PlaylistServiceLocal;

@Path("/playlist")
public class PlaylistREST {

	@EJB
	private PlaylistServiceLocal service;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Playlist> getAllPlaylists(){
		return service.getAllPlaylists();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Playlist getPlaylistById(@PathParam("id") Integer id){
		return service.getPlaylistById(id);
	}
	
	@POST
	@Path("/add/{id}/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPlaylist(@PathParam("id") Integer id, @PathParam("name") String name) {
		Playlist playlist = new Playlist(id, name);
		service.addPlaylist(playlist);
	}
	

	public void editPlaylist(Playlist playlist){
	
	}
	
	public void removePlaylist(Playlist playlist){
		
	}
	
	public void addTrackToPlaylist(Track track, Playlist playlist){
		
	}
	
}
