/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.gui.figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

/**
 *
 * @author cissanal
 */
public class GUI_canvas extends javax.swing.JFrame {

    /**
     * Creates new form GUI_canvas
     * @param c
     */
    
    private Circulo circle;
    private Rectangulo rectangle;
    
    
    public GUI_canvas(Circulo c) {
        initComponents();
        this.circle=c;
    }
    
    public GUI_canvas(Rectangulo r) {
        initComponents();
        this.rectangle=r;
    }
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D shape2D = (Graphics2D)g;
        //si la figura a pintar es un circulo
        if(this.circle !=null){
            drawCircle(shape2D);
        }
        if(this.rectangle!=null){
            drawRectangle(shape2D);
        }
        
        
//        
    }
    
    private void drawCircle(Graphics2D shape){
//        this.setTitle("Circle radius: "+this.circle.getRadio()+ " and area: "+ this.circle.area());//falla el area
        
        shape.setStroke(new BasicStroke(this.circle.getOutlineWidth()));
        shape.setColor(this.circle.getColor());
        int xCenter=(int)((this.getWidth()-2*this.circle.getRadio())/2);
        int yCenter=(int)((this.getHeight()-2*this.circle.getRadio())/2);
        if(this.circle.isFill()){
            
            shape.fillOval(xCenter, yCenter, (int)this.circle.getRadio()*2, (int)this.circle.getRadio()*2);
        }else{
            shape.drawOval(xCenter, yCenter, (int)this.circle.getRadio()*2, (int)this.circle.getRadio()*2);
        }
        
    }
    
     private void drawRectangle(Graphics2D shape){
        this.setTitle("Rectangle width: "+this.rectangle.getW()+" height:  "+this.rectangle.getH()+ " area: "+ this.rectangle.area());
         
        shape.setStroke(new BasicStroke(this.rectangle.getOutlineWidth()));
        shape.setColor(this.rectangle.getColor());
        int xCenter=(int)((this.getWidth()-rectangle.getW())/2);
        int yCenter=(int)((this.getHeight()-rectangle.getH())/2);
        if(this.rectangle.isFill()){
            shape.fillRect(xCenter, yCenter, (int)this.rectangle.getW(), (int)this.rectangle.getH());
        }else{
            shape.drawRect(xCenter, yCenter, (int)this.rectangle.getW(), (int)this.rectangle.getH());
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
