package oop.polymorphism.method_overloading.changing_number_of_arguments;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 1:28 PM
 * Description     :
 **/

public class TestMethodOverloadingByChangingNumberOfArguments {

    public static void main(String[] args) {
        System.out.println("Adding two numbers (5 + 6): " + Adder.add(5, 6));
        System.out.println("Adding three numbers (5 + 6 + 7): " + Adder.add(5, 6, 7));
    }
}
