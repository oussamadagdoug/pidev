package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Carpool
 *
 */
@Entity


public class Carpool extends Publication implements Serializable {

	
	
	
	private String Circuit;
	private int NbrePlace;
	private String LeavingHour;
	private String ReturnHour;
	private String LocationStart;
	private String LocationEnd;

	private static final long serialVersionUID = 1L;

	public Carpool() {
		super();
	} 
	
	
	public String getCircuit() {
		return this.Circuit;
	}

	public void setCircuit(String Circuit) {
		this.Circuit = Circuit;
	}   
	public int getNbrePlace() {
		return this.NbrePlace;
	}

	public void setNbrePlace(int NbrePlace) {
		this.NbrePlace = NbrePlace;
	}
	public String getLeavingHour() {
		return LeavingHour;
	}
	public void setLeavingHour(String leavingHour) {
		LeavingHour = leavingHour;
	}
	public String getReturnHour() {
		return ReturnHour;
	}
	public void setReturnHour(String returnHour) {
		ReturnHour = returnHour;
	}
	public String getLocationStart() {
		return LocationStart;
	}
	public void setLocationStart(String locationStart) {
		LocationStart = locationStart;
	}
	public String getLocationEnd() {
		return LocationEnd;
	}
	public void setLocationEnd(String locationEnd) {
		LocationEnd = locationEnd;
	}
   
}
