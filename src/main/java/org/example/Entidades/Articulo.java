package org.example.Entidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Articulo {
    private int cantidad;
    private String denominacion;
    private Long id;
    private double precio;
}

