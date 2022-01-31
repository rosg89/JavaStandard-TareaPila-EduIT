/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilatarea;

/**
 *
 * @author EducaciónIT
 */
public class Pila {
    
    
        private void m6(int x) {
        System.out.println("La suma es " + x );
        }
     
        private void m5(int x) {
        System.out.println("Antes de llamar a m6");
        m6(x+1);
        System.out.println("Despues de llamar a m6");
        }
        
        private void m4(int x) {
        System.out.println("Antes de llamar a m5");
        m5(x+1);
        System.out.println("Despues de llamar a m5");
        }
        
        private void m3(int x) {
        System.out.println("Antes de llamar a m4");
        m4(x+1);
        System.out.println("Despues de llamar a m4");
        }  
        
        private void m2(int x) {
        System.out.println("Antes de llamar a m3");
        m3(x+1);
        System.out.println("Despues de llamar a m3");
        }
      
        public void m1(int x) {
        System.out.println("Antes de llamar a m2");
        m2(x+1);
        System.out.println("Despues de llamar a m2");
        }
    


    
}
    
    
    
    
    
