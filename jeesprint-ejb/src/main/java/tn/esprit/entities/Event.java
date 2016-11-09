package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	
	private int IdEvent;
	private String EventName;
	private int EventPlace;
	private String EventDate;
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}   
	@Id    
	public int getIdEvent() {
		return this.IdEvent;
	}

	public void setIdEvent(int IdEvent) {
		this.IdEvent = IdEvent;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public int getEventPlace() {
		return EventPlace;
	}
	public void setEventPlace(int eventPlace) {
		EventPlace = eventPlace;
	}
	public String getEventDate() {
		return EventDate;
	}
	public void setEventDate(String eventDate) {
		EventDate = eventDate;
	}   
	
	
}
