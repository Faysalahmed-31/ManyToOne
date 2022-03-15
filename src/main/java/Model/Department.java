package Model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * POJO CLASS / Persistance class / model class
 */

public class Department {
    @Id
     private int dId;
    @GeneratedValue( strategy= GenerationType.IDENTITY )
     private String dName;

    public Department() {
        // default constructor
    }

    public Department(int dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
