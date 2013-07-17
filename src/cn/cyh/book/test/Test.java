package cn.cyh.book.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.cyh.book.imp.IBookDAO;
import cn.cyh.book.model.Book;

public class Test {
 public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");			 
	Book book=new Book();
	IBookDAO bd=(IBookDAO) ac.getBean("book");
	System.out.println("---------"+bd.findAll().size());
	book.setBookAuthor("杜甫");
	book.setBookContent("中国");
	book.setBookName("中国诗集");
	book.setBookPublish("商业出版社");
	book.setBookType("古诗");
	bd.save(book);
	List list=bd.findByBookAuthor("李白");
//	User u=new User();
//	IUserDAO ud=(IUserDAO) ac.getBean("user");
//	List list=ud.findByUserName("李四");
	System.out.println(list.size());
	System.out.println("OK");
	
 }
}
