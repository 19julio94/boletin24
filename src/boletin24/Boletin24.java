
package boletin24;

import java.util.Scanner;


public class Boletin24 {

    
    public static void main(String[] args) {
       
        float num1,num2;
        Scanner obx = new Scanner(System.in);
        
        System.out.println("introduce el numero 1: ");
        num1=obx.nextFloat();
        
        System.out.println("introduce el numero 2: ");
        num2= obx.nextFloat();
        
        System.out.println("Suma = \n"+(num1+num2)+ "\n Resta = \n"+(num1-num2)+
        "\n Multiplicacion = \n"+(num1*num2)+"\n Cociente = \n"+ (num1/num2));
    }
    
}  
