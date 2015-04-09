package dit.dss.dao;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.entities.Library;
import dit.dss.entities.User;

@Local
@Stateless
public interface LibraryDAO {

	public Collection<Library> getAllLibraries();
	public Library getLibraryById(Integer libraryId);
	public void addLibrary(Library library);
	public void editLibrary(Library library);
	public void removeLibrary(Library library);
	public void assignUserToLibrary(User user, Integer libraryId);
	
}
