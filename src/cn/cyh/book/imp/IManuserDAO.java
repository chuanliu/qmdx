package cn.cyh.book.imp;

import java.util.List;

import cn.cyh.book.model.Manuser;

public interface IManuserDAO {
	public void save(Manuser transientInstance);

	public void delete(Manuser persistentInstance);

	public Manuser findById(java.lang.Integer id); 
	public List findByExample(Manuser instance);

	public List findByProperty(String propertyName, Object value);
	public List findByManuserName(Object manuserName);

	public List findByManuserPass(Object manuserPass); 

	public List findAll();

	public Manuser merge(Manuser detachedInstance);
	public void attachDirty(Manuser instance); 
	public void attachClean(Manuser instance); 
}
