package com.pcfactory.ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 20)
    private String sku;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private Long marcaId;

    @Column(nullable = false)
    private Long modeloId;

    @Column(nullable = false)
    private double precio;

}
