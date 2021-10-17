/*
package org.itstep;

public class Trees {
    public static void main(String[] args) {
    //Tree.printInfo(Season.SPRING);
        Tree apple = new Decidious();
        Tree fir = new Conifer();

    }
}
    enum Season {Winter, Spring, Summer, Autumn};


    abstract class Tree {
       void printInfo(Season season) {
            System.out.println(season + ": ");
        }
    }
    class Conifer extends Tree {
        void printInfo(Season season) {
            super.printInfo(season);
            void getInfo (Season season){
                super.printInfo(season);
                switch (season) {
                    case Winter:
                        System.out.println("The tree stays green");
                        break;
                    case Spring:
                        System.out.println("The tree blooms");
                        break;
                    case Summer:
                        System.out.println("The tree grows quickly");
                        break;
                    case Autumn:
                        System.out.println("The tree grows slowly");
                        break;
                }
            }
        }
    }

//Лиственное дерево
class Decidious extends Tree{
    @Override
    void getInfo(Season season) {
        super.printInfo(season);
        switch (season) {
            case Winter:
                System.out.println("The tree is naked");
                break;
            case Spring:
                System.out.println("The tree blooms");
                break;
            case Summer:
                System.out.println("The tree grows very quickly");
                break;
            case Autumn:
                System.out.println("The tree sheds leaves");
                break;

        }
    }
}
    */