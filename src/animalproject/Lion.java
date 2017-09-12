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
public class Lion extends Mammal implements IWalk, IMakeSound{
    public Lion(String name, double bodyTemp)
    {
        super(name,bodyTemp);
    }

    @Override
    public void Walk() {
        System.out.println(name + " Walks");
    }

    @Override
    public void MakeSound() {
        System.out.println("Rhoooooor");
    }
}
