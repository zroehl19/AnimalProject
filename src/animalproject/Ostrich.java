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
public class Ostrich extends Bird implements IWalk, ISwim, IMakeSound{
    public Ostrich(String name, double wingSpan)
    {
        super(name,wingSpan);
    }

    @Override
    public void Walk() {
        System.out.println(name + " Walks");
    }
    
    @Override
    public void Swim() {
        System.out.println(name + " swims");
    }

    @Override
    public void MakeSound() {
        System.out.println("REEERRRRRR");
    }
}
