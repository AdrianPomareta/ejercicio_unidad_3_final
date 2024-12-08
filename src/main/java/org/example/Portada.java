package org.example;
/**
 * Ejercicio final unidad 3: base de datos biblioteca
 * ORM Hibernete
 * V_0_1 08-12-2024 Adrian Pomareta
 */
public class Portada {
    private  int idPortada;
    private String descripcion;
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
