/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.util.Scanner;

/**
 *
 * @author cissanal
 */
public class MiExcepcion extends Exception{ //esta clase hereda de exception
    
    public MiExcepcion(String msg){
        super(msg);
        System.out.println(msg);
    }
    
    
    
}
