/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_hectorsabillon;
import java.util.Scanner;

/**
 *
 * @author hdann
 */
public class Lab2P1_HectorSabillon {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ejercicio;
        
        
        do {
            System.out.println("1 <- Ejercicio 1 - Minimo Comun Divisor");
            System.out.println("2 <- Ejercicio 2 - Sumatoria");
            System.out.println("3 <- Ejercicio 3 - Supermercado");
            System.out.println("4 <- Salir");
            System.out.println("Ingrese el numero de ejercicio a visualizar: ");
            ejercicio = leer.nextInt();
           if (ejercicio == 1){
               int num1 = 0, num2 = 0, resta = 0;
               while (num1 <= 0 || num2 <= 0){
                   
               System.out.println("Ingrese el primer numero: ");
               num1 = leer.nextInt();
               System.out.println("Ingrese el segundo numero");
               num2 = leer.nextInt();
               if (num1 == 0 || num2 == 0){
                   System.out.println("Los numeros ingresados deben ser positivos");
               }
               }//Entrada ejercicio 1
               while (num1 != num2){
                   if (num1 > num2){
                       num1 -= num2;
                   } else {
                       num2 -= num1;
                   }
               }
               System.out.println("El minimo comun denominador es: " + num1);
           } else if (ejercicio == 2){
               int limite = 1;
               do {
               System.out.println("Ingrese el numero limite de la sumatoria: ");
               limite = leer.nextInt();
               if (limite <= 0){
                   System.out.println("No puede ingresar un numero negativo o cero");
               }//Entrada y validacion ejercicio 2
               } while (limite <= 0);
                   double cont = 1, acum = 0, suma;
                   while (cont <= limite){
                       suma = Math.pow((cont/(cont + 1)), cont);
                       acum += suma;
                       cont++;
                   }
                   System.out.println("El resultado de la sumatoria es: " + acum);
               } else if (ejercicio == 3){
                   int tipo_cliente = 0, ct_prod;
                   double p_unidad, total, descuento, subtotal;
                   if (tipo_cliente >= 0 && tipo_cliente <= 2){
                       System.out.println("Ingrese el tipo de cliente ");
                       tipo_cliente = leer.nextInt();
                       if (tipo_cliente < 0 || tipo_cliente > 2){
                           System.out.println("El tipo de cliente ingresado no es valido");
                       } //Fin entrada y validacion ejercicio 3
                       else{
                          if (tipo_cliente == 0){
                              System.out.println("Ingrese el precio de la unidad del producto: ");
                              p_unidad = leer.nextDouble();
                              System.out.println("Ingrese la cantidad del producto: ");
                              ct_prod = leer.nextInt();
                              if (ct_prod >= 10 && ct_prod <= 19){
                                  ct_prod -= 2;
                              } else { 
                                  if (ct_prod >= 20){
                                    ct_prod -= 5;
                              }
                              }//Fin validacion cliente 0
                              total = ct_prod * p_unidad;
                              System.out.println("El total a pagar es: " + total);
                          } else 
                              if (tipo_cliente == 1){
                              descuento = 0.1;
                              System.out.println("Ingrese el precio de la unidad del producto: ");
                              p_unidad = leer.nextDouble();
                              System.out.println("Ingrese la cantidad del producto: ");
                              ct_prod = leer.nextInt();
                              if (ct_prod >= 20 && ct_prod <= 29){
                                  ct_prod -= 2;
                              } else { 
                                  if (ct_prod >= 30){
                                    ct_prod -= 5;
                              }
                              }//Fin validacion cliente 1
                              subtotal = (ct_prod * p_unidad);
                              total = subtotal - (subtotal * descuento);
                              System.out.println("El total a pagar es: " + total);
                          } else {
                                  if (tipo_cliente == 2){
                                    descuento = 0.3;
                                    System.out.println("Ingrese el precio de la unidad del producto: ");
                                    p_unidad = leer.nextDouble();
                                    System.out.println("Ingrese la cantidad del producto: ");
                                    ct_prod = leer.nextInt();
                                    if (ct_prod >= 20 && ct_prod <= 29){
                                        ct_prod -= 2;
                                    } else { 
                                        if (ct_prod >= 30){
                                            ct_prod -= 5;
                                    }
                                    }//Fin validacion cliente 2
                                    subtotal = (ct_prod * p_unidad);
                                    total = subtotal - (subtotal * descuento);
                                    System.out.println("El total a pagar es: " + total);
                                  }
                              }
                                 
                       }
                   }
               }
        } while (ejercicio != 4);
}
}