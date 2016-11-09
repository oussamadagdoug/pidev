package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PropretyOwner
 *
 */
@Entity

public class PropretyOwner implements Serializable {

	
	private int IdOwner;
	private String Name;
	private String Login;
	private String Pwd;
	private int Cin;
	private int Age;
	private String Sex;
	private static final long serialVersionUID = 1L;

	public PropretyOwner() {
		super();
	}   
	@Id    
	public int getIdOwner() {
		return this.IdOwner;
	}

	public void setIdOwner(int IdOwner) {
		this.IdOwner = IdOwner;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}   
	public String getPwd() {
		return this.Pwd;
	}

	public void setPwd(String Pwd) {
		this.Pwd = Pwd;
	}   
	public int getCin() {
		return this.Cin;
	}

	public void setCin(int Cin) {
		this.Cin = Cin;
	}   
	public int getAge() {
		return this.Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}   
	public String getSex() {
		return this.Sex;
	}

	public void setSex(String Sex) {
		this.Sex = Sex;
	}
   
}
