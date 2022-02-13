package com.kulquiango.sobrecarga;

public class Sobrecarga {
    public static void main(String[] args) {
    /*envio la cantidad de elementos que quiera*/
        System.out.println("Suma sobrecarga con argumentos ...argumentos: " + Calculadora.sumar(5,3,6,1,3,4));
        System.out.println("Suma sobrecarga con argumentos ...argumentos y otra varible de entrada: " + Calculadora.sumar(12.1F,1,2,1,5,6));
        System.out.println("Suma metodo tradicional: " + Calculadora.sumar(1,2));

    }
}
