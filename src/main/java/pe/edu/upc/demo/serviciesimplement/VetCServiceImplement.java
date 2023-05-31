package pe.edu.upc.demo.serviciesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo.entities.VetClean;
import pe.edu.upc.demo.repositories.IVetCRepository;
import pe.edu.upc.demo.services.IVetCService;

import java.util.List;

@Service
public class VetCServiceImplement implements IVetCService {
    @Autowired
    private IVetCRepository vtR;
    @Override
    public void insert(VetClean vetClean) {
        vtR.save(vetClean);
    }

    @Override
    public List<VetClean> list() {
        return vtR.findAll();
    }
}
