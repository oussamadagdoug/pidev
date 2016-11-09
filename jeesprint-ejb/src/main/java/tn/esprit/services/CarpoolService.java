package tn.esprit.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.entities.Carpool;
import tn.esprit.entities.Student;

public class CarpoolService implements CarpoolserviceRemote, CarpoolServiceLocal {

	/**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
	
    public  CarpoolService() {
		// TODO Auto-generated constructor stub
	}
    @Override
	public Boolean createCarpool(Carpool c) {
		try{
		em.persist(c);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	@Override
	public Boolean updateCarpool(Carpool c) {
		try{
			em.merge(c);
			}catch(Exception e){
				return false;
			}
			return true;
		}

	@Override
	public Carpool findById(Integer id) {
		Carpool c=em.find(Carpool.class,id);
		return c;
	}
	
	@Override
	public Boolean deleteCarpool(Carpool c ) {
		try{
			em.remove(em.merge(c));
			}catch(Exception e){
				return false;
			}
			return true;
		}

	@Override
	public List<Carpool> fidAll() {
		Query q=em.createQuery("select c from Carpool c");
		return q.getResultList();
	}

	@Override
	public Student authentifcate(String login, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
