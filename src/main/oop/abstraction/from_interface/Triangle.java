package oop.abstraction.from_interface;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 7:36 PM
 * Description     :
 **/

public class Triangle implements Shape {

    @Override
    public double getArea(double height, double width) {
        return 0.5 * width * height;
    }
}
