package com.kulquiango.sobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    /*SOBRE CARGA VARIABLE DE ARGUMENTO*/
    // es un arreglo

    public static int sumar(int... argumentos) {
        int total = 0;
        for (int a: argumentos
             ) {
            total +=a;
        }
        return total;
    }

    public static float sumar(float a, int... b){
        float total=0;
        for (int i:b
             ) {
            total+=i;
        }
        return a+total;
    }
    public static double sumar(double a,int b){
        return a+b;
    }

}
