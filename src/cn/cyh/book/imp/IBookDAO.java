package cn.cyh.book.imp;

import java.util.List;

import cn.cyh.book.model.Book;

public interface IBookDAO{
	public void save(Book transientInstance);
	
	public void delete(Book persistentInstance);

	public Book findById(java.lang.Integer id); 

	public List findByExample(Book instance);
	

	public List findByProperty(String propertyName, Object value); 

	public List findByBookName(Object bookName) ;

	public List findByBookAuthor(Object bookAuthor);

	public List findByBookType(Object bookType);

	public List findByBookPublish(Object bookPublish);

	public List findByBookContent(Object bookContent); 
	public List findAll() ;
	public Book merge(Book detachedInstance); 

	public void attachDirty(Book instance) ;

	public void attachClean(Book instance) ;
}
