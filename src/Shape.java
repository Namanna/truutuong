/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lenovo
 */

 public abstract class Shape {
    private double x;
    private double y;
    public Shape(double initX, double initY)
    {
        this.x = initX;
        this.y = initY;
    }
    public abstract double getArea();
    
}
 