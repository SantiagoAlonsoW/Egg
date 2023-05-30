/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Santiago
 */
public class Alumno {
    
    private String Nombre;
    private double Nota;

    public Alumno() {
    }

    public Alumno(String Nombre, double Nota) {
        this.Nombre = Nombre;
        this.Nota = Nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }
    
}
