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

import dit.dss.entities.Track;
import dit.dss.services.TrackServiceLocal;

@Path("/track")
public class TrackREST {

	@EJB
	private TrackServiceLocal service;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Track> getAllTracks(){
		return service.getAllTracks();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackById(@PathParam("id") Integer id){
		return service.getTrackById(id);
	}
	
	@POST
	@Path("/add/{id}/{name}/{album}/{artist}/{genre}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addTrack(@PathParam("id") Integer id, 
			@PathParam("name") String name, @PathParam("album") String album, 
			@PathParam("artist") String artist, @PathParam("genre") String genre) {
		Track track = new Track(id, name, album, artist, genre);
		service.addTrack(track);
	}
	

	public void editTrack(Track track) {
		
	}

	public void removeTrack(Track track) {
		
	}
	
}
