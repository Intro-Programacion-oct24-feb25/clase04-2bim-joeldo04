/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import static ejemplos03.Ejemplo031.obtenerSuma;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensajeSuma;
        String mensajeSumaDos;
        // mensajeSuma = obtenerTablaSumar(10, 9); // se invoca al método 
        // obtenerTablaSumar
        // y el valor que 
        // devuelve se lo 
        // almacena  en mensajeSuma

        int lim;
        int tab;
        int proceso;

        System.out.println("Ingrese valor del limite");
        lim = entrada.nextInt();
        System.out.println("Ingrese valor de la tabla");
        tab = entrada.nextInt();
        System.out.println("Ingrese 1 Suma - 2 Multiplicacion ");
        proceso = entrada.nextInt();

        mensajeSuma = obtenerTablaSumar(lim, tab);
        mensajeSumaDos = obtenerTablaMultiplicar(lim, tab);

        switch (proceso) {
            case 1:
                System.out.printf("%s\n", mensajeSuma);
                break;
            case 2:
                System.out.printf("%s\n", mensajeSumaDos);
                break;
        }

    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
