/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import java.util.ArrayList;

/**
 *
 * @author zroehl
 */
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bird objects
        Ostrich tim = new Ostrich("Tim",6.6);
        Penguin aiden = new Penguin("Aiden",4.0);
        Eagle tyler = new Eagle("Tyler",7.5);
        //Mammal objects
        Dolphin israel = new Dolphin("Israel",98.6);
        Lion mrG = new Lion("MrG",102.5);
        Bat blake = new Bat("Blake",111.2);
        //Fish objects
        Shark john = new Shark("John",true);
        Bass ag = new Bass("AG",false);
        FlyingFish anthony = new FlyingFish("Anthony",true);
        
        //Animals
        ArrayList<Animal> animals = new ArrayList<>();
            animals.add(ag);
            animals.add(tim);
            animals.add(aiden);
            animals.add(tyler);
            animals.add(israel);
            animals.add(mrG);
            animals.add(blake);
            animals.add(john);
            animals.add(anthony);
        //Birds
        ArrayList<Bird> bird = new ArrayList<>();
            bird.add(tim);
            bird.add(aiden);
            bird.add(tyler);
        //Mammals
        ArrayList<Mammal> mammals = new ArrayList<>();
            mammals.add(mrG);
            mammals.add(israel);
            mammals.add(blake);
        //Fish
        ArrayList<Fish> fish = new ArrayList<>();
            fish.add(ag);
            fish.add(john);
            fish.add(anthony);
        //Flyers
        ArrayList<IFly> flyers = new ArrayList<>();
            flyers.add(blake);
            flyers.add(tyler);
            flyers.add(anthony);
        //Walkers
        ArrayList<IWalk> walkers = new ArrayList<>();
            walkers.add(mrG);
            walkers.add(blake);
            walkers.add(tyler);
            walkers.add(aiden);
            walkers.add(tim);
        //Swimmers
        ArrayList<ISwim> swimmers = new ArrayList<>();
            swimmers.add(ag);
            swimmers.add(anthony);
            swimmers.add(john);
            swimmers.add(israel);
            swimmers.add(aiden);
            swimmers.add(tim);
        //SoundMakers
        ArrayList<IMakeSound> soundMakers = new ArrayList<>();
            soundMakers.add(ag);
            soundMakers.add(tim);
            soundMakers.add(aiden);
            soundMakers.add(tyler);
            soundMakers.add(israel);
            soundMakers.add(mrG);
            soundMakers.add(blake);
            soundMakers.add(john);
            soundMakers.add(anthony);
            
        for(Animal all: animals)
        {
            System.out.println(all.getName());
        }
        
        for(Bird birds: bird)
        {
            System.out.println(birds.toString());
        }
        
        for(Mammal mammal: mammals)
        {
            System.out.println(mammal.toString());
        }
        
        for(Fish fishes: fish)
        {
            System.out.println(fishes.toString());
        }
        
        for(IFly fly: flyers)
        {
            fly.Fly();
        }
    }
    
}
