package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Carpool;

public interface CarpoolserviceRemote {

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
