package pe.edu.upc.demo.serviciesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo.entities.Pet;
import pe.edu.upc.demo.repositories.IPetRepository;
import pe.edu.upc.demo.services.IPetService;

import java.util.List;

@Service
public class  PetServiceImplement implements IPetService {
    @Autowired
    private  IPetRepository pR;

    @Override
    public void insert(Pet pet) {
        pR.save(pet);
    }

    @Override
    public List<Pet> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPet) {
        pR.deleteById(idPet);
    }

    @Override
    public Pet LisID(int idPet) {
        return pR.findById(idPet).orElse(new Pet());
    }
}
/////////////



