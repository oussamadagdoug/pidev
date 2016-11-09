package tn.esprit.entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Collocation
 *
 */
@Entity

public class Collocation implements Serializable {

	
	private int IdCollocation;
	private String Address;
	private Float Price;
	private String Specification;
	private static final long serialVersionUID = 1L;

	public Collocation() {
		super();
	}   
	@Id    
	public int getIdCollocation() {
		return this.IdCollocation;
	}

	public void setIdCollocation(int IdCollocation) {
		this.IdCollocation = IdCollocation;
	}   
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}   
	public Float getPrice() {
		return this.Price;
	}

	public void setPrice(Float Price) {
		this.Price = Price;
	}   
	public String getSpecification() {
		return this.Specification;
	}

	public void setSpecification(String Specification) {
		this.Specification = Specification;
	}
   
}
