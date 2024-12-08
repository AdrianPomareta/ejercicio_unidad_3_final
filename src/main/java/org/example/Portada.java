package org.example;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Ejercicio final unidad 3: base de datos biblioteca
 * ORM Hibernete
 * V_0_2 08-12-2024 Adrian Pomareta
 */
@Entity
@Table(name = "portada")
public class Portada {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_portada")
    private  int idPortada;
    @Column(name = "descripcion_portada")
    private String descripcion;
    @Column(name = "url")
    private String url;

    public Portada(){

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdPortada() {
        return idPortada;
    }

    public void setIdPortada(int idPortada) {
        this.idPortada = idPortada;
    }

    @Override
    public String toString() {
        return "Portada{" +
                "idPortada=" + idPortada +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
