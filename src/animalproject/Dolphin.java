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
public class Dolphin extends Mammal implements ISwim{
    public Dolphin(String name, int bodyTemp)
    {
        super(name,bodyTemp);
    }
    
    public void Name()
    {
        System.out.println("Name: "+name);
    }
    
    public void BodyTemp()
    {
        System.out.println("Body Temperature: "+bodyTemp);
    }
    
    @Override
    public void Swim() {
        System.out.println("I swim");
    }
}
