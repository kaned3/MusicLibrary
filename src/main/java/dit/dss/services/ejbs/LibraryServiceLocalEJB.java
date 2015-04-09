package dit.dss.services.ejbs;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.dao.LibraryDAO;
import dit.dss.entities.Library;
import dit.dss.entities.User;
import dit.dss.services.LibraryServiceLocal;

@Local
@Stateless
public class LibraryServiceLocalEJB implements LibraryServiceLocal {

	@EJB
	private LibraryDAO dao;

	public Collection<Library> getAllLibraries() {
		return dao.getAllLibraries();
	}

	public Library getLibraryById(Integer libraryId) {
		return dao.getLibraryById(libraryId);
	}

	public void addLibrary(Library library) {
		dao.addLibrary(library);
	}

	public void editLibrary(Library library) {
		
	}

	public void removeLibrary(Library library) {
		
	}

	public void assignUserToLibrary(User user, Integer libraryId) {
		
	}
	
	
	
}
