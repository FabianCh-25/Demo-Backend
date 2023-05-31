package pe.edu.upc.demo.services;

import pe.edu.upc.demo.entities.Vaccine;

import java.time.LocalDate;
import java.util.List;


public interface IVaccineService {
    public void insert(Vaccine vac);
    List<Vaccine> list();
    List<Vaccine> find(LocalDate fecha);
}
