package tn.esprit.entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trip
 *
 */
@Entity

public class Trip implements Serializable {

	
	private int IdTrip;
	private Float Price;
	private int NbrePlaces;
	private String LeavingDate;
	private String ReturnDate;
	private String LocationStart;
	private String Direction;
	private static final long serialVersionUID = 1L;

	public Trip() {
		super();
	}   
	@Id    
	public int getIdTrip() {
		return this.IdTrip;
	}

	public void setIdTrip(int IdTrip) {
		this.IdTrip = IdTrip;
	}   
	  
	public Float getPrice() {
		return this.Price;
	}

	public void setPrice(Float Price) {
		this.Price = Price;
	}
	public int getNbrePlaces() {
		return NbrePlaces;
	}
	public void setNbrePlaces(int nbrePlaces) {
		NbrePlaces = nbrePlaces;
	}
	public String getLeavingDate() {
		return LeavingDate;
	}
	public void setLeavingDate(String leavingDate) {
		LeavingDate = leavingDate;
	}
	public String getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}
	public String getLocationStart() {
		return LocationStart;
	}
	public void setLocationStart(String locationStart) {
		LocationStart = locationStart;
	}
	public String getDirection() {
		return Direction;
	}
	public void setDirection(String direction) {
		Direction = direction;
	}   
	
	
	
   
}
