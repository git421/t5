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
public class Recursividad1 {
    
    public static void contar(int i){
        System.out.println(i+" ");
        if(i==100){
           return;
       }
        contar(++i);
       
    }
    public static void main(String[] args) {
        contar(1);
    }
    
    
    
}
