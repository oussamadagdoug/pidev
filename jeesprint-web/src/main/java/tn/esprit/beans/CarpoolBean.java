package tn.esprit.beans;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.esprit.entities.Carpool;
import tn.esprit.services.CarpoolServiceLocal;


@ManagedBean
@ViewScoped
public class CarpoolBean {

	@EJB
	CarpoolServiceLocal local;
	private Carpool c=new Carpool();
	private Boolean test=false;
	private List<Carpool> carpools=new ArrayList<Carpool>();
		
	public Carpool getC() {
		return c;
	}
	public void setC(Carpool c) {
		this.c = c;
	}

	public String ajouter(){
		local.createCarpool(c);
		init();
		return null;	
		
	}
	
	public String update(){
		local.updateCarpool(c);
		init();
		return null;
	}
	public String delete(Carpool c){
		local.deleteCarpool(c);
		return null;
	}
	public List<Carpool> getCarpools() {
		return carpools;
	}
	public void setCarpools(List<Carpool> carpools) {
		this.carpools = carpools;
	}
	@PostConstruct
	public void init(){
		c=new Carpool();
		carpools=local.fidAll();
		test=false;
		
	}
	
	
	public Boolean getTest() {
		return test;
	}
	public void setTest(Boolean test) {
		this.test = test;
	}
	public String initialiser(){
		test=true;
		
		return null;
		
	}
	
}
