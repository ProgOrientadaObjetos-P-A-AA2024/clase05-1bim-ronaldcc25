/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10, 9, 8, 10};
        String  n = "Ronald Calderon";
        
        LibretaCalificacion lista = new LibretaCalificacion(n, notas);
        
        lista.establecerPromedio();
        /* 
        al momento que comentamos la linea 20 el programa ya no llama al metodo
        para tomar el valor de esa varibale
        */
        lista.establecerPromedioCualitativo();
        /*
        en este caso sucede lo mismo si comentamos la linea 25 ya no estamos 
        recibiendo ningun valor para la variable que esta dentro del metodo
        entonces toma el valor por defecto dicha variable
        */
        System.out.printf("%s",lista);
    }
    
}
