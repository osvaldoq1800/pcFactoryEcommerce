package com.pcfactory.ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ventas_productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ventas_Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long ventaId;

    @Column(nullable = false)
    private Long productoId;

    @Column(nullable = false)
    private int cantidad;
}

