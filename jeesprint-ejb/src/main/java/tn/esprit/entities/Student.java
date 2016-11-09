package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;




/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	
	private int IdStudent;
	private int NumStudentCard;
	private String Image;
	private String UniversityName;
	private String Login;
	private String Pwd;
	
	private static final long serialVersionUID = 1L;
	
	private List<Publication> publications;
	
	
	@OneToMany
	public List<Publication> getPublications() {
		return publications;
	}
	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}
	public Student() {
		super();
	}   
	@Id    
	public int getIdStudent() {
		return this.IdStudent;
	}

	public void setIdStudent(int IdStudent) {
		this.IdStudent = IdStudent;
	}   
	public int getNumStudentCard() {
		return this.NumStudentCard;
	}

	public void setNumStudentCard(int NumStudentCard) {
		this.NumStudentCard = NumStudentCard;
	}   
	public String getImage() {
		return this.Image;
	}

	public void setImage(String Image) {
		this.Image = Image;
	}   
	public String getUniversityName() {
		return this.UniversityName;
	}

	public void setUniversityName(String UniversityName) {
		this.UniversityName = UniversityName;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	
   
}
