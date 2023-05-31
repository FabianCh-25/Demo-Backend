package pe.edu.upc.demo.services;

import pe.edu.upc.demo.entities.VetClean;

import java.util.List;

public interface IVetCService {
    public void insert(VetClean vetClean);
    List<VetClean> list();
}
