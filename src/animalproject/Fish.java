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
public abstract class Fish extends Animal {
    boolean isSaltWater;

    public Fish(String name, boolean isSaltWater)
    {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    @Override
    public String toString() {
        if(isSaltWater == true)
        {
            return name + " is a salt water fish";
        }
        else
        {
            return name + " is not a salt water fish";
        }
    }
    
    
}
