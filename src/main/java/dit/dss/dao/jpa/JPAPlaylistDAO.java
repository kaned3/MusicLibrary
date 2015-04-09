package dit.dss.dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dit.dss.dao.PlaylistDAO;
import dit.dss.entities.Playlist;
import dit.dss.entities.Track;

@Local
@Stateless
public class JPAPlaylistDAO implements PlaylistDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Collection<Playlist> getAllPlaylists() {
		Query q = entityManager.createQuery("from Playlist");
		List<Playlist> playlists = q.getResultList();
		return playlists;
	}

	public Playlist getPlaylistById(Integer id) {
		Query q = entityManager.createQuery("from Playlist playlist where playlist.id = :id");
		q.setParameter("id", id);
		List<Playlist> playlists = q.getResultList();
		return playlists.get(0);
	}

	public void addPlaylist(Playlist playlist) {
		entityManager.persist(playlist);
	}

	public void editPlaylist(Playlist playlist) {
		//TODO
	}

	public void removePlaylist(Playlist playlist) {
		//TODO
	}

	public void addTrackToPlaylist(Track track, Playlist playlist) {
		//TODO
	}

}
