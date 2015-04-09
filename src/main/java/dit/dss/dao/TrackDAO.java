package dit.dss.dao;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.entities.Track;

@Local
@Stateless
public interface TrackDAO {

	public Collection<Track> getAllTracks();
	public Track getTrackById(Integer trackId);
	public void addTrack(Track track);
	public void editTrack(Track track);
	public void removeTrack(Track track);
	
}
