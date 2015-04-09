package dit.dss.services.ejbs;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.dao.TrackDAO;
import dit.dss.entities.Track;
import dit.dss.services.TrackServiceLocal;

@Local
@Stateless
public class TrackServiceLocalEJB implements TrackServiceLocal{

	@EJB
	private TrackDAO dao;
	
	public Collection<Track> getAllTracks() {
		return dao.getAllTracks();
	}

	public Track getTrackById(Integer trackId) {
		return dao.getTrackById(trackId);
	}

	public void addTrack(Track track) {
		dao.addTrack(track);
	}

	public void editTrack(Track track) {
		
	}

	public void removeTrack(Track track) {
		
	}
	
}
