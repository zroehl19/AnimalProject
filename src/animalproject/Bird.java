/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

/**
 *
 * @author zroehl
 */
public abstract class Bird extends Animal{
    double wingSpan;
    
    public Bird(String name, double wingSpan)
    {
        super(name);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return name + " has a wingspan of " + wingSpan;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
