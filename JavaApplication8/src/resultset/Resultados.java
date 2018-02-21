/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author diego
 */
public class Resultados {
    private ResultSet rs1;

    public Resultados() {
        rs1 = null;
    }
    
    /*
    Esta funcion obtiene un Result Set de una base de datos.
    La tabla solo tiene 3 campos, codigo, nombre y nota
    Va a retornar un arreglo de enteros con las notas de los estudiantes
    1 xander 67
    2 pancho 65
    3 juana 64
    
    Retornaria un arreglo de [67,65,64]
    */
    
    public int [] arreglosetResultSetUno(){
        Estudiantes es = new Estudiantes();
        rs1 = es.getTabla();
        int contador = 0;
        int [] arr = null;
        int i = 0;
        try {
            while (rs1.next()){
                contador++;
            }
            arr = new int[contador];
            while (rs1.next()){
            arr[i] = rs1.getInt(3);
            i++;    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Resultados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return arr;
    }
    
    /*
    Esta funcion es similar con la anterior, con la diferencia que retornara un arreglo con 
    los alumnos que sacaron notas igual o mayor a 65
    
    1 xander 67
    2 pancho 65
    3 juana 64
    
    Retornaria un arreglo de [67,65]
    
    */
    public int [] getAlumnosquepasaron(){
        Estudiantes es = new Estudiantes();
        rs1 = es.getTabla();
        int [] arr = null;
        int contador = 0;
        int i = 0;
        try {
            while (rs1.next()){
                contador++;
            }
            arr = new int[contador];
            while (rs1.next()){
                if (rs1.getInt(3) >= 65) {
                    arr[i] = rs1.getInt(3);
                    i++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Resultados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    
}
