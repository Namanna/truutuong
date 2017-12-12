

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Round extends Shape{
    private double Radius;
    public Round(double initX, double initY, double initRadius)
    {
        super(initX, initY);
        this.Radius = initRadius;
    }
    public double getArea()
    {
        return Math.PI * Radius * Radius;
    }
}