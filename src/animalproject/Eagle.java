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
public class Eagle extends Bird implements IFly, IWalk, IMakeSound{
    public Eagle(String name, double wingSpan)
    {
        super(name,wingSpan);
    }
    
    @Override
    public void Fly() {
        System.out.println(name + " flies.");
    }

    @Override
    public void Walk() {
        System.out.println(name + " Walks");
    }

    @Override
    public void MakeSound() {
        System.out.println("Screeech");
    }
}
