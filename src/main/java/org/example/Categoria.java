package org.example;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Ejercicio final unidad 3: base de datos biblioteca
 * ORM Hibernete
 * V_0_2 08-12-2024 Adrian Pomareta
 */
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_categoria")
    private  int idCategoria;
    @Column(name = "nombre_categoria")
    private String nombre;

    public  Categoria(){


    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
