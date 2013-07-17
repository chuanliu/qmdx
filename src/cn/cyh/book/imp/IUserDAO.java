package cn.cyh.book.imp;

import java.util.List;

import cn.cyh.book.model.User;

public interface IUserDAO {
	public void save(User transientInstance);

	public void delete(User persistentInstance);
	
	public List findByProperty(String propertyName, Object value);

	public User findById(java.lang.Integer id); 	

	public List findByUserName(Object userName);

	public List findByUserPass(Object userPass);

	public List findAll();
	
	public User merge(User detachedInstance);

	public void attachDirty(User instance); 

	
}
