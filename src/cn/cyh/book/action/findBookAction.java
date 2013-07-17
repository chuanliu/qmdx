package cn.cyh.book.action;

import java.util.List;

import cn.cyh.book.imp.IBookDAO;
import cn.cyh.book.model.Book;

import com.opensymphony.xwork2.ActionSupport;

public class findBookAction extends ActionSupport{
	private IBookDAO bdao=null;
	private String name;
	private String author;
	private String type;
	private String publish;
	private String content;
	private List<Book> book;
    public String getName() {
		return name;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public IBookDAO getBdao() {
		return bdao;
	}
	public void setBdao(IBookDAO bdao) {
		this.bdao = bdao;
	}
	public String findByBookName() throws Exception{
		book=bdao.findByBookName(name);
    	return SUCCESS;
    }
    public String findByBookAuthor()throws Exception{
    	book = bdao.findByBookAuthor(author);
    	System.out.println(book.size());
    	return SUCCESS;
    }
    public String findByBookPublish()throws Exception{
    	book=bdao.findByBookPublish(publish);
    	return SUCCESS;
    }
    public String findByBookContent()throws Exception{
    	book=bdao.findByBookContent(content);
    	return SUCCESS;
    }
    public String findByBookType()throws Exception{
    	book=bdao.findByBookType(type);
    	return SUCCESS;
    }
   
}
