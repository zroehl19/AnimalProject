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
    int wingSpan;
    
    public Bird(String name, int wingSpan)
    {
        super(name);
        this.wingSpan = wingSpan;
    }
}
