/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

/**
 *
 * @author cissanal
 */
public class NewClass {
    //metodo que recibe un tipo basico int
    public static void metodo(int i){ 
        i++;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Antes de llamar al metodo, n vale: "+n);
        metodo(n);
        System.out.println("Despues de llamar al metodo, n vale: "+n);
        //n se mantiene intacta, cuando se modifica en el metodo, no afecta, copia en memoria etc 
        
        
        
    }
    
    
}
