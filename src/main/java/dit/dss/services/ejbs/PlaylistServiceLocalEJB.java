package dit.dss.services.ejbs;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.dao.PlaylistDAO;
import dit.dss.entities.Playlist;
import dit.dss.entities.Track;
import dit.dss.services.PlaylistServiceLocal;

@Local
@Stateless
public class PlaylistServiceLocalEJB implements PlaylistServiceLocal {

	@EJB
	private PlaylistDAO dao;

	public Collection<Playlist> getAllPlaylists() {
		return dao.getAllPlaylists();
	}

	public Playlist getPlaylistById(Integer id) {
		return dao.getPlaylistById(id);
	}

	public void addPlaylist(Playlist playlist) {
		dao.addPlaylist(playlist);
	}

	public void editPlaylist(Playlist playlist) {
		dao.editPlaylist(playlist);
	}

	public void removePlaylist(Playlist playlist) {
		dao.editPlaylist(playlist);
	}

	public void addTrackToPlaylist(Track track, Playlist playlist) {
		dao.addTrackToPlaylist(track, playlist);
	}
	
}
