/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author LAB-SI-PC
 */
public class ShapeExamples {
    public class Main {
    public static void main(String[] args) {
        shape circle = new Circle(7);
        shape square = new Square(5);

        System.out.println(circle.getName() + " Area = " + circle.getArea());
        System.out.println(square.getName() + " Area = " + square.getArea());
    }
}

}