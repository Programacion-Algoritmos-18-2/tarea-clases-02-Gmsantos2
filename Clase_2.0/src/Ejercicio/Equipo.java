/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Gerson
 */
public class Equipo {
    //declaracion de variables
    String nombre; 
    int num_jugadores;
    String ciudad;
    public void agregar_nombre (String y){ //metodo que recibe un valor
        nombre = y; // asignacion de el dato y la variable inicializada
    }
    public String obtener_nombre (){ //metodo obtener
        return nombre;
    }
    public void agregar_numjugadores (int x){ 
        num_jugadores = x;
    }
    public int obtener_njugadores (){ //metodo obtener
        return num_jugadores;
    }
    public void agregar_ciudad (String c){ 
        ciudad = c;
    }
    public String obtener_ciudad (){ //metodo obtener
        return ciudad;
    }
    public Equipo(){//inicio de constructor equipo
        //agrego valores a metodos 
        agregar_nombre("Ballenita F.C"); 
        agregar_numjugadores(40);
        agregar_ciudad("Quito");
    }
    public Equipo(String y){
        agregar_nombre(y);
    }
    public Equipo (String y, int x){
        agregar_nombre(y);
        agregar_numjugadores(x);   
    }
    public Equipo (String y, int x,String z){
        agregar_nombre(y);
        agregar_numjugadores(x);   
        agregar_ciudad(z);
    }
}
