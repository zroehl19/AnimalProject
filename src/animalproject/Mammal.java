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
    int bodyTemp;
    
    public Mammal(String name, int bodyTemp)
    {
        super(name);
        this.bodyTemp = bodyTemp;
    }
}
