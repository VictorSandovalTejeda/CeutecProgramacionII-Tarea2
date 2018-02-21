/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import logica.logica;
import resultset.Resultados;

/**
 *
 * @author diego
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        logica log = new logica();
        int[] arreglo = {0,8,10,7,23,6};
        int llave = 23;
        
        //BUSCAR
        System.out.println("1. BUSCAR");
        System.out.println("Posición: " + log.buscar(arreglo, llave));
        System.out.println();
        
        
        //FECHA VALIDA
        System.out.println("2. FECHA VALIDA");
        System.out.println(log.fechavalida(2014, 6, 4));
        System.out.println(log.fechavalida(2016, 2, 29));
        System.out.println(log.fechavalida(2015, 2, 30));
        System.out.println(log.fechavalida(2015, 4, 31));
        System.out.println();
        
        
        //PRIMO
        System.out.println("3. NUMERO PRIMO");
        System.out.println(log.esPrimo(31));
        System.out.println(log.esPrimo(32));
        System.out.println();
        
        
        //arreglosetResultSetUno
        
        Resultados res = new Resultados();
        System.out.println("4. NOTAS");
        System.out.println(res.arreglosetResultSetUno());
        System.out.println();
        
        
        //getAlumnosquepasaron
        System.out.println("4. ALUMNOS QUE PASARON");
        System.out.println(res.getAlumnosquepasaron());
        System.out.println();
    }
    
}
