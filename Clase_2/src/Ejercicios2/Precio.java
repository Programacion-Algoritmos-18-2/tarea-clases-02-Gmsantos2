/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;


/**
 *
 * @author Gerson
 */
public class Precio {
    private double euros; // declaracion de variable privada
    public double obtener (){ //metodo obrener
        return euros; //retorna el valor de la variable
    }
    public void agregar (double x){// metodo agregar donde recibe un double
        euros = x; //los datos se van agregando en la variable euros
    }
}
