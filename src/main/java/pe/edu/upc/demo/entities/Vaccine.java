package pe.edu.upc.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "vaccines")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVaccine;
    @Column(name = "nameVaccine",length = 40,nullable = false)
    private String nameVaccine;
    @Column(name = "dateVaccine",nullable = false)
    private LocalDate dateVaccine;
    @Column(name = "observationVaccine",length = 400,nullable = false)

    private String observationVaccine;
    @ManyToOne
    @JoinColumn(name = "idPet")
    private Pet pet;

    public Vaccine() {
    }

    public Vaccine(int idVaccine, String nameVaccine, LocalDate dateVaccine, String observationVaccine, pe.edu.upc.demo.entities.Pet pet) {
        this.idVaccine = idVaccine;
        this.nameVaccine = nameVaccine;
        this.dateVaccine = dateVaccine;
        this.observationVaccine = observationVaccine;
        this.pet = pet;
    }

    public pe.edu.upc.demo.entities.Pet getPet() {
        return pet;
    }

    public void setPet(pe.edu.upc.demo.entities.Pet pet) {
        this.pet = pet;
    }

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


}
