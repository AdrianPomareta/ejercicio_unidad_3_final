package org.example;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Ejercicio final unidad 3: base de datos biblioteca
 * ORM Hibernete
 * V_0_2 08-12-2024 Adrian Pomareta
 */
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id_autor")
    private int idAutor;
    @Column(name = "nombre_autor")
    private String nombreAutor;
    @Column(name="nacionalidad")
    private String nacionalidad;

    public Autor(){

    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
