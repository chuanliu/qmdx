package cn.cyh.book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import cn.cyh.book.imp.IManuserDAO;
import cn.cyh.book.imp.IUserDAO;
import cn.cyh.book.model.User;
import cn.cyh.book.model.Manuser;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private IUserDAO udao=null;
	@Autowired
	private IManuserDAO mdao=null;
	private List list;
	private List li;
	HttpServletRequest req= ServletActionContext.getRequest();
    HttpSession session=ServletActionContext.getRequest().getSession();
    

public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public IUserDAO getUdao() {
		return udao;
	}


	public void setUdao(IUserDAO udao) {
		this.udao = udao;
	}


	public IManuserDAO getMdao() {
		return mdao;
	}


	public void setMdao(IManuserDAO mdao) {
		this.mdao = mdao;
	}
public String userLogin()throws Exception{
	System.out.println("用户类型普通用户");
	list = udao.findByUserName(username);
	if(list.size()<=0){
		System.out.println("用户不存在!");
		req.setAttribute("mess", "用户不存在!");
		return ERROR;
		}
	else{
			User u=(User) list.get(0);
			if(u.getUserPass().equals(password)){
				 System.out.println("登录成功");	       
			     session.setAttribute("user",u);
			     return SUCCESS; 
	     }	  
			 else{
				 req.setAttribute("mess","密码不对!");
	  		     System.out.println("登录失败");	      	    
	  		     return ERROR;
			
			 }
	}
  }
public String manuserLogin()throws Exception{
	 System.out.println("用户类型管理员");
	 li = mdao.findByManuserName(username);
		if(li.size()<=0){
			System.out.println("用户不存在!");
			req.setAttribute("mess", "用户不存在!");
			return ERROR;
		}
		else{
			Manuser u=(Manuser)li.get(0);
			if(u.getManuserPass().equals(password)){
				 System.out.println("登录成功");	       
			     session.setAttribute("manuser",u);
			     return SUCCESS; 
		    }
		else{
			     req.setAttribute("mess","密码不对!");
			     System.out.println("登录失败");	      	    
			     return ERROR;  
			}
}	  
}
}    
  
	 	  


