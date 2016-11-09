package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;


import javax.persistence.*;



/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator implements Serializable {

	
	private int IdAdministrator;
	private String Name;
	private String LastName;
	private String Login;
	private String Password;
	
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}   
	@Id    
	public int getIdAdministrator() {
		return this.IdAdministrator;
	}

	public void setIdAdministrator(int IdAdministrator) {
		this.IdAdministrator = IdAdministrator;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}   
	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}   
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	
   
}
