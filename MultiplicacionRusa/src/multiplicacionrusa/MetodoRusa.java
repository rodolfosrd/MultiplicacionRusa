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
public class MetodoRusa extends Listarusa<Integer> {
         private Listarusa<Integer> res;
         public MetodoRusa() {
                  super();
                  res = new Listarusa<Integer>();
         }
         
         public Integer suma(Listarusa<Integer> div2, Listarusa<Integer> mul2){
                  Metodonodo<Integer> primdiv = div2.prim;
                  Metodonodo<Integer> primmul = mul2.prim;
                  Metodonodo<Integer> primres;
                  Integer resTotal = 0; 
                  
                  while(primdiv != null){
                           if(primdiv.info % 2 == 1)
                                    res.insertaFinal(primmul.info);
                           primdiv = primdiv.sig;
                           primmul = primmul.sig;
                  }
                  primres = res.prim;
                  while(primres != null){
                           resTotal += primres.info;
                           primres = primres.sig;
                  }
                  return resTotal;
         }  
}
