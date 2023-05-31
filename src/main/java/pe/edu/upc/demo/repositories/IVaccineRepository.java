package pe.edu.upc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo.entities.Vaccine;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IVaccineRepository extends JpaRepository<Vaccine,Integer> {
    //JPQL
    @Query("from Vaccine v where v.dateVaccine=:fecha")
    List<Vaccine> BuscarVacunas(@Param("fecha")LocalDate fecha);

}
