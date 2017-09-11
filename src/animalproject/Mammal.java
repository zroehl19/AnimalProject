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
public abstract class Mammal extends Animal {
    double bodyTemp;
    
    public Mammal(String name, double bodyTemp)
    {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    @Override
    public String toString() {
        return getName() + " has a body tempurature of " + getBodyTemp();
    }
}
