package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@NamedQuery(name = "Boat.deleteAllRows", query = "DELETE from Boat")
public class Boat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long b_id;
    private String brand;
    private String make;
    private String name;

    @OneToMany(cascade =CascadeType.PERSIST )
    List<Owner> oners;

    public List<Owner> getOners() {
        return oners;
    }

    public void addOner(Owner owner) {
        this.oners.add(owner);
        if(owner != null){
            owner.setBoat(this);
        }
    }

    public Boat() {
    }

    public Boat(String brand, String make, String name) {
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.oners = new ArrayList<>();
    }

    public Long getB_id() {
        return b_id;
    }

    public void setB_id(Long b_id) {
        this.b_id = b_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
