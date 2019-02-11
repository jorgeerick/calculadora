/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
	
import java.util.Scanner;
 
public class Calculadora {
    public static double c;
    
    public Calculadora(){
        this.c =0;
    }
 
     
    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
       double a,b;
        
       while(!salir){
            
           System.out.println("1. Sumar 1");
           System.out.println("2. Restar 2");
           System.out.println("3. Multiplicacion 3");
           System.out.println("4. Division 4");
           System.out.println("5. Sustraer 5");
           System.out.println("6. Adicionar 6");
           System.out.println("7. Elevar 7");
           System.out.println("8. Salir");
            
           System.out.println("Elige una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Ingresa el primer valor");
                   a = sn.nextInt();
                   System.out.println("Ingresa el Segundo valor");
                   b = sn.nextInt();
                   c = a+b;
                   System.out.println("El resultado de la suma es : " + c);
                   
                   break;
               case 2:
                   System.out.println("Ingresa el primer valor");
                   a = sn.nextInt();
                   System.out.println("Ingresa el Segundo valor");
                   b = sn.nextInt();
                   c = a-b;
                   System.out.println("El resultado de la resta es : " + c);
                   
                   break;
                case 3:
                   System.out.println("Ingresa el primer valor");
                   a = sn.nextInt();
                   System.out.println("Ingresa el Segundo valor");
                   b = sn.nextInt();
                   c = a*b;
                   System.out.println("El resultado de la multiplicacion es : " + c);
                   
                   break;
                   case 4:
try {
                System.out.print("Ingrese el dividendo: ");
                a = sn.nextFloat();
                System.out.print("Ingrese el divisor: ");
                b = sn.nextFloat();
                if (b == 0.0f) {
                    throw new ArithmeticException();  
                } else {
                    c = a / b;
                    System.out.println("El resultado es " + c);
                }
            } catch (ArithmeticException ae) {
                System.out.println(" No es posible dividir por cero, vuelva a intentarlo ");
            }
                   break;
               case 5:
                   System.out.println("Ingresa el valor a sustraer");
                   a = sn.nextInt();
                   c = c-a;
                   System.out.println("El resultado de la sustraccion es " + c);
                   break;
                case 6:
                   System.out.println("Ingresa el valor a adicionar");
                   a = sn.nextInt();
                   c = c+a;
                   System.out.println("El resultado de la adiccion es " + c);
                   break;
                   case 7:
                   System.out.println("Ingrese la base");
                   a = sn.nextInt();
                   System.out.println("Ingrese el exponente");
                   b = sn.nextInt();
                   c = Math.pow(a, b);
                   System.out.println("El resultado de la potencia es " + c);
                   
                   break;
                case 8:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 8");
           }
            
       }
        
    }

}
     

