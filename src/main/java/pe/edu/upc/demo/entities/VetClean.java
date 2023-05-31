package pe.edu.upc.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "vetcleans")
public class VetClean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idVetC;
    @Column(name = "nameVetC",length = 50, nullable = false)
    private String nameVetC;
    @Column(name = "ageVet",length = 150,nullable = false)
    private  int ageVet;

    public VetClean() {
    }

    public VetClean(int idVetC, String nameVetC, int ageVet) {
        this.idVetC = idVetC;
        this.nameVetC = nameVetC;
        this.ageVet = ageVet;
    }

    public int getIdVetC() {
        return idVetC;
    }

    public void setIdVetC(int idVetC) {
        this.idVetC = idVetC;
    }

    public String getNameVetC() {
        return nameVetC;
    }

    public void setNameVetC(String nameVetC) {
        this.nameVetC = nameVetC;
    }

    public int getAgeVet() {
        return ageVet;
    }

    public void setAgeVet(int ageVet) {
        this.ageVet = ageVet;
    }
}
