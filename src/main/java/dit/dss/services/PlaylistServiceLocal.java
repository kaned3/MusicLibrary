package dit.dss.services;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.entities.Playlist;
import dit.dss.entities.Track;

@Local
@Stateless
public interface PlaylistServiceLocal {

	public Collection<Playlist> getAllPlaylists();
	public Playlist getPlaylistById(Integer id);
	public void addPlaylist(Playlist playlist);
	public void editPlaylist(Playlist playlist);
	public void removePlaylist(Playlist playlist);
	public void addTrackToPlaylist(Track track, Playlist playlist);
	
}
