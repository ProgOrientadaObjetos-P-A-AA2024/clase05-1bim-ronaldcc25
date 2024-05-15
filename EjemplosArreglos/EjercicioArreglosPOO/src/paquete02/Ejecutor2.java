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
        lista.establecerPromedioCualitativo();
        
        System.out.printf("%s",lista);
    }
    
}
