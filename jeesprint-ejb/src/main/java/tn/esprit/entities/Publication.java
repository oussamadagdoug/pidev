package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Publication
 *
 */
@Entity

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Publication implements Serializable {

	
	private int Idpub;
	private String Description;
	
	private static final long serialVersionUID = 1L;
	
	private Student student;
	
	
	
	
	@ManyToOne
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Publication() {
		super();
	}   
	@Id    
	public int getIdpub() {
		return this.Idpub;
	}

	public void setIdpub(int Idpub) {
		this.Idpub = Idpub;
	}   
	
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}
	
   
}
