package oop.polymorphism.method_overloading.changing_data_type_of_arguments;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 1:30 PM
 * Description     :
 **/

public class Divider {

    public static int divide(int a, int b) {
        return a / b;
    }
    public static double divide(double a, double b, double c) {
        return a / b / c;
    }
}
