
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Square extends Shape
{
    private double Side;

 public Square(double initX, double initY, double initSide)
     { 
         super(initX,initY); 
         this.Side = initSide; 
     } 
   public double getArea(){
        return Side * Side;
    }
}