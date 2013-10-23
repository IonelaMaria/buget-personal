package login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	private String login;
	private String password;
 
	
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String welcome(){
		FacesContext facesContext = FacesContext.getCurrentInstance();
	    if ("admin".equals(login) && "pass".equals(password)) {
	        return "success";
	    } else {
	        facesContext.addMessage(null, new FacesMessage("Username or password is incorrect"));
	        return null;
	    }
		
	}

}
