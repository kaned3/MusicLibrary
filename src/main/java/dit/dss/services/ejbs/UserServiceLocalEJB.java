package dit.dss.services.ejbs;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import dit.dss.dao.UserDAO;
import dit.dss.entities.Library;
import dit.dss.entities.User;
import dit.dss.services.UserServiceLocal;

@Local
@Stateless
public class UserServiceLocalEJB implements UserServiceLocal{

	@EJB
	private UserDAO dao;
	
	public Collection<User> getAllUsers() {
		return dao.getAllUsers();
	}

	public User getUserById(Integer userId) {
		return dao.getUserById(userId);
	}

	public void addUser(User user) {
		dao.addUser(user);
	}

	public void editUser(User user) {
		dao.editUser(user);
	}

	public void removeUser(User user) {
		dao.removeUser(user);
	}

	public void assignLibraryToUser(User user, Library library) {
		dao.assignLibraryToUser(user, library);
	}

}
