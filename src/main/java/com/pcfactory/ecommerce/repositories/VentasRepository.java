package com.pcfactory.ecommerce.repositories;

import com.pcfactory.ecommerce.models.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository<Ventas, Long> {
}
