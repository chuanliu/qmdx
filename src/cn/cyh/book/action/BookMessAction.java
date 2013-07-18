package cn.cyh.book.action;

import java.util.List;

import cn.cyh.book.imp.IBookDAO;
import cn.cyh.book.model.Book;

import com.opensymphony.xwork2.ActionSupport;

public class BookMessAction extends ActionSupport{
	private String name;
	private String author;
	private String type;
	private String publish;
	private String content;
	private IBookDAO bdao=null;
	private List<Book> bo;
	private String Jack;
	private String test;

	public List<Book> getBo() {
		return bo;
	}
	public void setBo(List<Book> bo) {
		this.bo = bo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setBdao(IBookDAO bdao) {
		this.bdao = bdao;
	}
	public IBookDAO getBdao() {
		return bdao;
	}
	public String addBook()throws Exception{
		Book book=new Book();
		book.setBookName(name);
		book.setBookAuthor(author);
		book.setBookType(type);
		book.setBookPublish(publish);
		book.setBookContent(content);
		bdao.save(book);
		return SUCCESS;
	}
    public String delteBook()throws Exception{
    	return SUCCESS;
    }
    public String listBook() throws Exception{
        bo=bdao.findAll();
        System.out.println(bo.size());
    	return SUCCESS;
    }
}
