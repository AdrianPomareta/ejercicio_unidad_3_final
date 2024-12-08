package org.example;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Ejercicio final unidad 3: base de datos biblioteca
 * ORM Hibernete
 * V_0_2 08-12-2024 Adrian Pomareta
 */

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_libro")
    private  int idLibro;
    @Column(name = "titulo_libro")
    private String titulo;
    public  Libro(){

            }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}


