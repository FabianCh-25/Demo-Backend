package pe.edu.upc.demo.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo.dtos.VetCDTO;
import pe.edu.upc.demo.entities.VetClean;
import pe.edu.upc.demo.services.IVetCService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vetCs")
public class VetCController {
    @Autowired
    private IVetCService vtS;
    @PostMapping
    public void insert(@RequestBody VetCDTO dtoVe) {


        ModelMapper m = new ModelMapper();
        VetClean v = m.map(dtoVe, VetClean.class);
        vtS.insert(v);
    }

    @GetMapping
    public List<VetCDTO> list() {
        return vtS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VetCDTO.class);
        }).collect(Collectors.toList());
    }
}
