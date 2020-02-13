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
public class RecursividadFactorial {
    
    public static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(--n);
    }
    public static void main(String[] args) {
        int n=5;
        int f=factorial(5);
        System.out.println(f);
        
    }
    
    
    
}
