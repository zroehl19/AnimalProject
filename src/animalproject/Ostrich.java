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
public class Ostrich extends Bird implements IWalk, ISwim{
    public Ostrich(String name, int wingSpan)
    {
        super(name,wingSpan);
    }
    
    public void Name()
    {
        System.out.println("Name: "+name);
    }
    
    public void WingSpan()
    {
        System.out.println("WingSpan: "+wingSpan);
    }

    @Override
    public void Walk() {
        System.out.println("I Walk");
    }
    
    @Override
    public void Swim() {
        System.out.println("I swim");
    }
}