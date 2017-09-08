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
public class Lion extends Mammal implements IWalk{
    public Lion(String name, int bodyTemp)
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
    public void Walk() {
        System.out.println("I Walk");
    }
}
