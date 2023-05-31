package pe.edu.upc.demo.serviciesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo.entities.Vaccine;
import pe.edu.upc.demo.repositories.IVaccineRepository;
import pe.edu.upc.demo.services.IVaccineService;

import java.time.LocalDate;
import java.util.List;

@Service
public class VaccineServiceImplement implements IVaccineService {
    @Autowired
    private IVaccineRepository vR;

    @Override
    public void insert(Vaccine vac) {
    vR.save(vac);
    }

    @Override
    public List<Vaccine> list() {
        return vR.findAll();
    }

    @Override
    public List<Vaccine> find(LocalDate fecha) {
        return vR.BuscarVacunas(fecha);
    }
}
