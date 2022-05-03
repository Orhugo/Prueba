/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author hcalz
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println("hola");
        System.out.println("segunda prueba");
        System.out.println("cuesta abajo sin frenos");
        esCierto(2,3);
    }
    
    public static int resta(int a, int b) {
        return a - b;
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public boolean tonto(int num) {
        return num == 0;
    }
    
    public String nombre(String nom) {
        return "tu nombre es " + nom;
    }
    
    public static Boolean esCierto(int i, int j) {
        return i == j;
    }
}
