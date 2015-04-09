package dit.dss.dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dit.dss.dao.LibraryDAO;
import dit.dss.entities.Library;
import dit.dss.entities.User;

@Local
@Stateless
public class JPALibraryDAO implements LibraryDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	public Collection<Library> getAllLibraries() {
		Query q = entityManager.createQuery("from Library");
		List<Library> libraries = q.getResultList();
		return libraries;
	}

	public Library getLibraryById(Integer libraryId) {
		Query q = entityManager.createQuery("from Library library where library.id = :libraryId");
		q.setParameter("libraryId", libraryId);
		List<Library> libraries = q.getResultList();
		return libraries.get(0);
	}

	public void addLibrary(Library library) {
		entityManager.persist(library);
	}

	public void editLibrary(Library library) {
		
	}

	public void removeLibrary(Library library) {
	}

	public void assignUserToLibrary(User user, Integer libraryId) {
	}

}
