package org.itstep;

public class AnimalSchool {
    public static void main(String[] args) {
Duck duck= new Duck();
duck.run();duck.swim();
    }
}
interface runAble{
    public void run();
}
interface swimAble{
    public void swim();
}
 interface climbAble{
    public void climb();
 }
 class Duck implements swimAble, runAble {

     @Override
     public void run() {
         System.out.println("Duck: I am very poor in running");
     }

     @Override
     public void swim() {
         System.out.println("Duck: I am excellent in swimming");
     }
 }