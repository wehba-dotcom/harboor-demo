/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.OwnerDTO;
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
        FacadeExample fe = FacadeExample.getFacadeExample(emf);
        fe.create(new OwnerDTO(new Owner("First 1","Rønne",232323)));
        fe.create(new OwnerDTO(new Owner("First 2", "Allinger",4545454)));
        fe.create(new OwnerDTO(new Owner("First 3", "Nexo",343434)));

    }

    public static void main(String[] args) {
        populate();
    }
}
