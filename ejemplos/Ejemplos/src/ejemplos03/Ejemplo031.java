/*
 * Generar una solucion que permita sumar dos numeros a traves de un metodo
 * los numeros deben ser ingresados por teclado en el metodo main, el metodo
 * que genera la suma debe verificar que los dos numeros sean postivos para  
 * realizar la operacion caso contrario debe devolver 0 .
 */
package ejemplos03;

import ejemplos01.*;
import static ejemplos01.Ejemplo12.ingresarPersona;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;
        
        System.out.println("Ingrese primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese segundo valor");
        valor2 = entrada.nextInt();
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
         if( a > 0 && b>0 ){
             suma= a+b;   
         }else{
             suma=0;
         }
            
        return suma;
        // return a + b;
    }
    
    
}