package dit.dss.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library {

	@Id
	@Column(name="id")
	private Integer id;

	//TODO
	//OneToOne mapping to User

	//TODO
	//OneToMany mapping to Track
	
	//TODO
	//OneToOne mapping to User
	
	public Library() {
	}

	public Library(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
