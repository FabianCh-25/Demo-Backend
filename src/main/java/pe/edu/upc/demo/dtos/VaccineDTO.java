package pe.edu.upc.demo.dtos;

import pe.edu.upc.demo.entities.Pet;

import java.time.LocalDate;

public class VaccineDTO {
    private int idVaccine;
    private String nameVaccine;
    private LocalDate dateVaccine;

    private String observationVaccine;
    private Pet pet;

    public int getIdVaccine() {
        return idVaccine;
    }

    public void setIdVaccine(int idVaccine) {
        this.idVaccine = idVaccine;
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }

    public LocalDate getDateVaccine() {
        return dateVaccine;
    }

    public void setDateVaccine(LocalDate dateVaccine) {
        this.dateVaccine = dateVaccine;
    }

    public String getObservationVaccine() {
        return observationVaccine;
    }

    public void setObservationVaccine(String observationVaccine) {
        this.observationVaccine = observationVaccine;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
