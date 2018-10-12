/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios3;

/**
 *
 * @author Gerson
 */
public class Precio { 
    private double euros;//declaración de variable privada
    public double obtener (){ // metodo obtener
        return euros;// retona la variabe euros
    }
    public void agregar (double x){ // metodo agregar que recibe decimal
        euros = x; //se agrega en la variable privada
    }
    public Precio(){ // constructor precio 
        agregar(30.2); //mandamos un valor a agregar
    }
    public Precio(double y ){ //contstructor que recibe un valor double
        agregar(y); // mandamos al metodo agregar el valor de y 
    }
}
