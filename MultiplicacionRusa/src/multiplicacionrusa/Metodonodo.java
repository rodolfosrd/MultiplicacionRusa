/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionrusa;

/**
 *
 * @author Conza
 */
public class Metodonodo <T>{
         public T info;
         public Metodonodo<T> sig;

         public Metodonodo(T info, Metodonodo<T> sig) {
                this.info = info;
                this.sig = sig;
         }
         
         
}
