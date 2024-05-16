/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {

    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion[] calificaciones = {
            new Calificacion(10, "Computación"),
            new Calificacion(9, "Electrónica")};
        /*
        Hay como darle valor a un arreglo de tipo Calificacion(clase) para no
        tener que crear los objetos aparte y su sintaxis para dar valor seria
        new (nombre del tipo de la variable o el nombre de la clase) (atributos)
        */

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }

    }
}
