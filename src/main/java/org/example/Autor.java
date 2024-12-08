package org.example;

/**
 * Ejercicio final unidad 3: base de datos biblioteca
 * ORM Hibernete
 * V_0_1 08-12-2024 Adrian Pomareta
 */
public class Autor {
    private int idAutor;
    private String nombreAutor;
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
