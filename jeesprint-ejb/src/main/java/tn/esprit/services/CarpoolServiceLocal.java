package tn.esprit.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Carpool;
import tn.esprit.entities.Student;
@Local
public interface CarpoolServiceLocal {
	Student authentifcate(String login, String pwd);
	
	public Boolean createCarpool(Carpool c);
	//Modification
	public Boolean updateCarpool(Carpool c);
	//suppression
	public Boolean deleteCarpool(Carpool c);
	//Recherch par id
	public Carpool findById(Integer id);
	//Charger toute la liste des formateurs
	public List<Carpool> fidAll();
	
	
}
