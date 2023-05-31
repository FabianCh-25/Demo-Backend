package pe.edu.upc.demo.dtos;

import pe.edu.upc.demo.entities.Pet;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class VetCDTO {
    private int idVetC;
    private String nameVetC;
    private  int ageVet;

    private Pet pet;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
