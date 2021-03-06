package icc.practica03;
import java.util.Scanner;

/**
 *
 *@author Abel Santillan
 *@param args
 */
public class Factorial{
    
    public static void main(String[] args) {
	
        int num;
       	long factorial = 1;
	
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();
	/*iniciamos el ciclo con i igual al numero que metimos y mientras sea
	  mayor a cero decremente una vez*/
	
        for (int i = num; i > 0; i--) {
	    /*ejemplo el numero que metimos sea 7, i sera igual a 6 en la
            primera vuelta, después hará la operación 1*6 y se guarda en
            factorial solo dentro del ciclo, de forma que sera 7*6*5*4*3*2*1
            */
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
