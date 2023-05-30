/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador.ejercicio;

import entidad.Alumno;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class IntegradorEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[8];
        
        for (int i = 0; i < alumnos.length; i++) {
            
            String nombre = "Alumno" + (i+1);
            System.out.println("El alumno " + nombre);
            double nota = Math.random()*10;
            System.out.println("Tiene la nota: " + nota);
            alumnos[i]= new Alumno(nombre, nota);
        }
        
        double sumasNota = 0;
        for (int i = 0; i < alumnos.length; i++) {
            sumasNota += alumnos[i].getNota();
        }
        double promedioNota = sumasNota/alumnos.length;
        System.out.println("----------------------");
        System.out.println("El promedio de todas las notas es: " + promedioNota);
        System.out.println("----------------------");
        int contador = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota()>promedioNota){
                contador++;
            }
        }
        int pos = 0;
        String[] NombresAlumnos = new String[contador];
        for (int i = 0; i < alumnos.length; i++) {
            
            if(alumnos[i].getNota()>promedioNota){
               NombresAlumnos[pos]=alumnos[i].getNombre();
               pos++;
            }
            }
        
        System.out.println("Los alumnos q pasan el promedio son: ");
        for (int i = 0; i < contador; i++) {
           
            System.out.println("-" + NombresAlumnos[i]);
            
        }
    }
    
}
