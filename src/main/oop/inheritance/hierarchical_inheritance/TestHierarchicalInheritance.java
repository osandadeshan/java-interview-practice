package oop.inheritance.hierarchical_inheritance;

import oop.inheritance.single_inheritance.Dog;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 12:51 PM
 * Description     :
 **/

public class TestHierarchicalInheritance {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getSound();
        cat.eat();

        Dog dog = new Dog();
        dog.getSound();
        dog.eat();
    }
}
