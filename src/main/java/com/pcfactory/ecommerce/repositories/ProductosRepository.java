package com.pcfactory.ecommerce.repositories;

import com.pcfactory.ecommerce.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
}
