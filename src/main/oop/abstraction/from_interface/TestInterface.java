package oop.abstraction.from_interface;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 7:39 PM
 * Description     :
 **/

public class TestInterface {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println("Area of (10 X 5) Rectangle is: " + rectangle.getArea(10, 5));

        Shape triangle = new Triangle();
        System.out.println("Area of (10 X 5) Triangle is: " + triangle.getArea(10, 5));
    }
}
