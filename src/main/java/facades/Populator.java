/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.BoatDTO;
import dtos.OwnerDTO;
import entities.Boat;
import entities.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
            EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
       /* FacadeOwner fe = FacadeOwner.getFacadeOwner(emf);
        FacadeBoat fb = FacadeBoat.getFacadeBoat(emf);
        Owner o1=new Owner("First 1","Rønne",232323);
        fe.create(new OwnerDTO(o1));
        Owner o2 = new Owner("First 2", "Allinger",4545454);
        fe.create(new OwnerDTO(o2));
        fe.create(new OwnerDTO(new Owner("First 3", "Nexo",343434)));
        Boat b1 =new Boat("Tagger","Rønne","hason");
        fb.create(new BoatDTO(b1));
        Boat b2 = new Boat("Sozi", "Alborg","Bread");

        fb.create(new BoatDTO(b2));
        fb.create(new BoatDTO(new Boat("Fade", "Nexo","Sames")));*/
        EntityManager em = emf.createEntityManager();

        Owner o1 = new Owner("wehba","Rønne",234456);
        Owner o2 = new Owner("ram","Rønne",12312312);

        Boat b1= new Boat("Rose","Jonke","sadar");
        Boat b2= new Boat("Shar","sade","gades");

        b2.addOner(o1);
        b1.addOner(o2);
        b1.addOner(o1);

        em.getTransaction().begin();
        em.persist(b1);
        em.persist(b2);
        em.getTransaction().commit();

    }

    public static void main(String[] args) {
        populate();
    }
}
