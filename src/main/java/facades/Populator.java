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

import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
            EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        FacadeOwner fe = FacadeOwner.getFacadeOwner(emf);
        FacadeBoat fb = FacadeBoat.getFacadeBoat(emf);
        fe.create(new OwnerDTO(new Owner("First 1","Rønne",232323)));
        fe.create(new OwnerDTO(new Owner("First 2", "Allinger",4545454)));
        fe.create(new OwnerDTO(new Owner("First 3", "Nexo",343434)));
        fb.create(new BoatDTO(new Boat("Tagger","Rønne","hason")));
        fb.create(new BoatDTO(new Boat("Sozi", "Alborg","Bread")));
        fb.create(new BoatDTO(new Boat("Fade", "Nexo","Sames")));
        
    }

    public static void main(String[] args) {
        populate();
    }
}
