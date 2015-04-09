package dit.dss.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playlist")
public class Playlist {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;

	// TODO
	// ManyToOne mapping to Library

	// TODO
	// ManyToMany mapping to Playlist

	public Playlist() {

	}

	public Playlist(Integer id, String name) {
		this.id = id;
		this.name = name;
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

}
