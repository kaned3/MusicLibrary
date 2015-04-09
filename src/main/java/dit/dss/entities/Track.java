package dit.dss.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "track")
public class Track {

	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="album")
	private String album;
	@Column(name="artist")
	private String artist;
	@Column(name="genre")
	private String genre;
	
	//TODO
	//ManyToOne mapping to Library

	//TODO
	//ManyToMany mapping to Playlist
	
	
	public Track(){
	}
	
	public Track(Integer id, String name, String album, String artist, String genre){
		this.id = id;
		this.name = name;
		this.album = album;
		this.artist = artist;
		this.genre = genre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
