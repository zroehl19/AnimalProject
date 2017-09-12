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
public class Dolphin extends Mammal implements ISwim, IMakeSound{
    public Dolphin(String name, double bodyTemp)
    {
        super(name,bodyTemp);
    }
    
    @Override
    public void Swim() {
        System.out.println(name + " swims");
    }

    @Override
    public void MakeSound() {
        System.out.println("cli-i-i-i-i-i-ick");
    }
}
