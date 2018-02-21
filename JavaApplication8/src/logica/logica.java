/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author diego
 */
public class logica {

    public logica() {
    }
    
    /*
    El ejercicio de buscar va a recibir de parametros un arreglo y una llave.
    El objetivo de este ejercicio es buscar la llave en el arreglo y devolver la
    posicion donde se encuentra la llave. Caso contrario que no esta, deberia retornar -1
    Ejemplo
    arreglo [4,5,6,8]
    buscar(arreglo,8)
    Va a retornar 3
    
    */
    public int buscar(int [] arreglo, int llave){
        int position = -1;
        
        for (int i = 0; i < arreglo.length; i++) {
            
            if (arreglo[i]==llave) {
                position = i;                
            }
        }
        
        return position;
    }
    
    
    /*
    Este ejercio recibira de 3 argumentos de parametros.
    int year, int mes, int dia
    El objetivo del ejercicio es que tiene que retornar true si es una fecha valida y false si no lo es.
    Los año bisiesto se tienen que tomar en cuenta.
    
    Tome en consideracion que la funcion solo funcionara con años del 1-5000
    Si no cumple esos requisitos deberia de retorn false
    
    Estas fechas van a retornar true
    2014,6,4
    2016,2,29
    
    Estas fechas van a retorn false
    2015,2,30
    2015,4,31
    */
    
    public boolean fechavalida(int year, int mes, int dia){
        boolean answer = false;
        
        if (year >= 1 && year <= 5000) {
            if (mes >= 1 && mes <= 12 ) {
                if (mes == 1){
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }else if (mes == 2) {
                    if (dia >=1 && dia <= 28) {
                        answer = true;
                    }else if (dia == 29) {
                        if (year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
                            answer = true;
                        }
                    }
                }else if (mes == 3) {
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }else if (mes == 4) {
                    if (dia>=1 && dia <=30) {
                        answer = true;
                    }
                }else if (mes == 5) {
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }else if (mes == 6) {
                    if (dia>=1 && dia <=30) {
                        answer = true;
                    }
                }else if (mes == 7) {
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }else if (mes == 8) {
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }else if (mes == 9) {
                    if (dia>=1 && dia <=30) {
                        answer = true;
                    }
                }else if (mes == 10) {
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }else if (mes == 11) {
                    if (dia>=1 && dia <=30) {
                        answer = true;
                    }
                }else if (mes == 12) {
                    if (dia>=1 && dia <=31) {
                        answer = true;
                    }
                }
            }
        }
        
        return answer;
    }
    
    /*
    La siguiente funcion tiene que validar si un numero es primo.
    Retornara True si el numero es primo y false si no lo es
    */
    public boolean esPrimo(int numero){
       boolean primo = true;
        
        for (int i = 2; i <= numero/2; i++) {
            if (numero%i == 0) primo=false;
            
        }
        return primo;
    }
    
    
}
