package dit.dss.dao;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.entities.Library;
import dit.dss.entities.User;

@Local
@Stateless
public interface UserDAO {

	public Collection<User> getAllUsers();
	public User getUserById(Integer userId);
	public void addUser(User user);
	public void editUser(User user);
	public void removeUser(User user);
	public void assignLibraryToUser(User user, Library library);
	
	
}
