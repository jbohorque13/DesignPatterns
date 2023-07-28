/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author josue
 */
public class Singleton { // Lazy constrution 
    // the class variable is nulll if no instance is instantiated
    private static Singleton uniqueInstance = null;
    public String color = "";
    
    private Singleton() {
        this.color = "verde";
    }
    
    // lazy contruction of the instance
    public static Singleton getInstance () {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
    public static void main (String args[]) {
        Singleton singleton = Singleton.getInstance(); 
        System.out.println("prueba");   
    }
}
