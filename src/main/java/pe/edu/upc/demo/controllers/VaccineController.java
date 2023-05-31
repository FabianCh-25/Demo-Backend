package pe.edu.upc.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo.dtos.VaccineDTO;
import pe.edu.upc.demo.entities.Vaccine;
import pe.edu.upc.demo.services.IVaccineService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vaccines")
public class VaccineController {
    @Autowired
    private IVaccineService vS;
    @PostMapping

    public void insert(@RequestBody VaccineDTO dtoV) {


        ModelMapper m = new ModelMapper();
        Vaccine v = m.map(dtoV, Vaccine.class);
        vS.insert(v);
    }

    @GetMapping
    public List<VaccineDTO> list() {
        return vS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VaccineDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscar")
    public List<VaccineDTO> search(@RequestBody LocalDate fec) {
        return vS.find(fec).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VaccineDTO.class);
        }).collect(Collectors.toList());
    }
}
