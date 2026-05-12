package com.pcfactory.ecommerce.services;

import com.pcfactory.ecommerce.models.Vehiculo;
import com.pcfactory.ecommerce.repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> listarTodos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo obtenerPorId(Long id) {
        return vehiculoRepository.findById(id).orElse(null);
    }
}
