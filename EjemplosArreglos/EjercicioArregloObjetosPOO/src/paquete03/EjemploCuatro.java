/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class EjemploCuatro {
    public static void main(String[] args) {
        /*
        Los objetos(clases) se puedes usar dentro de otros obtjetos
        y se los usaria al momento de presentar como esta en la linea 35
        */
        Profesor profesor1 = new Profesor("Richard", "nombramiento");
        Profesor profesor2 = new Profesor("Rene", "clases");
        
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación",profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica",profesor2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - %s - %s\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(), 
                    /*
                    Para presentar los datos del objeto (clase) llamada Profesor
                    tenemos que ingresar por medio del nuevo objeto creado en
                    la linea 30 a los metodos para poder presentar los nombres
                    y los tipos
                    */
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());            
        }
        
    }
}
