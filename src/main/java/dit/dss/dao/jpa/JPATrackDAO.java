package dit.dss.dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dit.dss.dao.TrackDAO;
import dit.dss.entities.Track;

@Local
@Stateless
public class JPATrackDAO implements TrackDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Collection<Track> getAllTracks() {
		Query q = entityManager.createQuery("from Track");
		List<Track> tracks = q.getResultList();
		return tracks;
	}
	
	public Track getTrackById(Integer trackId) {
		Query q = entityManager.createQuery("from Track track where track.id = :trackId");
		q.setParameter("trackId", trackId);
		List<Track> tracks = q.getResultList();
		return tracks.get(0);
	}
	
	public void addTrack(Track track) {
		entityManager.persist(track);
	}

	public void editTrack(Track track) {
		// TODO Auto-generated method stub
		
	}
	
	public void removeTrack(Track track) {
		// TODO Auto-generated method stub
		
	}
	
}
