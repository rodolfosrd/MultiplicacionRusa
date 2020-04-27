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
public class Listarusa<T> {
         protected Metodonodo<T> prim;

         public Listarusa() {
                  prim = null;
         }
         
         public String toString(){
                  String resp = "";
                  Metodonodo<T> p;
                  p = prim;
                  while(p != null){
                           resp +=  "\n"+p.info;
                           p = p.sig;
                  }
                  return resp;
         }
         
         public void insertaFinal(T obj){
                  Metodonodo<T> p;
                  p = prim;
                  if(prim == null)
                           prim = new Metodonodo<T>(obj,null);
                  else{
                            while(p.sig != null)
                                     p = p.sig;
                            p.sig = new Metodonodo<T>(obj,null);
                  }
         }
}
