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
public class Bass extends Fish implements ISwim, IMakeSound{
    public Bass(String name, boolean isSaltWater)
    {
        super(name, isSaltWater);
    }
    
    public void Name()
    {
        System.out.println("Name: "+name);
    }
    
    public boolean IsSaltWaterTF()
    {
        return isSaltWater;
    }
    
    public void IsSaltWater()
    {
        if(isSaltWater == true)
        {
            System.out.println("Salt Water Fish");
        }
        else
        {
            System.out.println("Fresh Water Fish");
        }
    }

    @Override
    public void Swim() {
        System.out.println(name + " swims");
    }

    @Override
    public void MakeSound() {
        System.out.println("Bluub");
    }
}
