package dit.dss.dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dit.dss.dao.UserDAO;
import dit.dss.entities.Library;
import dit.dss.entities.User;

@Local
@Stateless
public class JPAUserDAO implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Collection<User> getAllUsers() {
		Query q = entityManager.createQuery("from User");
		List<User> users = q.getResultList();
		return users;
	}
	
	public User getUserById(Integer userId) {
		Query q = entityManager.createQuery("from User user where user.id = :userId");
		q.setParameter("userId", userId);
		List<User> users = q.getResultList();
		return users.get(0);
	}
	
	public void addUser(User user) {
		entityManager.persist(user);
	}

	public void editUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public void assignLibraryToUser(User user, Library library) {
		// TODO Auto-generated method stub
		
	}

}
