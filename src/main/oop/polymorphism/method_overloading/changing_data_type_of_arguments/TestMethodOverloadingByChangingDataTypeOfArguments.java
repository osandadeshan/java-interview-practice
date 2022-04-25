package oop.polymorphism.method_overloading.changing_data_type_of_arguments;

import oop.polymorphism.method_overloading.changing_number_of_arguments.Adder;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 1:32 PM
 * Description     :
 **/

public class TestMethodOverloadingByChangingDataTypeOfArguments {

    public static void main(String[] args) {
        System.out.println("Dividing two numbers (6 / 5): " + Divider.divide(6, 5));
        System.out.println("Dividing three numbers (7.9 / 6.1 / 5.2): " + Divider.divide(7.9, 6.1, 5.2));
    }
}
