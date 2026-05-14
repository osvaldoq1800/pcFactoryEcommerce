package com.pcfactory.ecommerce.repositories;

import com.pcfactory.ecommerce.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
