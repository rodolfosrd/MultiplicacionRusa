package multiplicacionrusa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Conza
 */
public class MultiplicacionRusa {
         public static Listarusa<Integer> div2;
         public static Listarusa<Integer> mul2;
         public static Scanner lee;
         
         public static void creaListas(int num1, int num2){
                  div2 = new Listarusa<Integer>();
                  mul2 = new Listarusa<Integer>();
                  if(num1 < num2){
                            int aux;
                           aux = num1;
                           num1 = num2;
                           num2 = aux;
                  }
                  while(num2 >= 1){ 
                           div2.insertaFinal(num2);
                           num2 = num2/2;
                           mul2.insertaFinal(num1);
                           num1 = num1*2;
                  }      
         }
         
         public static void main(String[] args) {
                  int num1,num2;
                  lee =  new Scanner(System.in);
                  System.out.println("Primer numero:  ");
                  num1 = lee.nextInt();
                  System.out.println("Segundo numero: ");
                  num2 = lee.nextInt();
                  creaListas(num1,num2);
                  MetodoRusa r = new MetodoRusa();
                  System.out.println("Resultado = "+r.suma(div2, mul2));
        }
    
}
