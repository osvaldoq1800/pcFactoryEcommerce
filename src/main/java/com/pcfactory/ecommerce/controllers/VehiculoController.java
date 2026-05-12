package com.pcfactory.ecommerce.controllers;

import com.pcfactory.ecommerce.models.Vehiculo;
import com.pcfactory.ecommerce.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public List<Vehiculo> listarTodos() {
        return vehiculoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Vehiculo obtenerPorId(@PathVariable Long id) {
        return vehiculoService.obtenerPorId(id);
    }
}
