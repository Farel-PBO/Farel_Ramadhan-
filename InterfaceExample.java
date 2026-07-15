/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author LAB-SI-PC
 */
public class InterfaceExample {
    public static void main(String[] args){
        Line line1 = new Line (1, 5, 1, 5);
        Line line2 = new Line (0, 5, 0, 5);
        Relation line = new Line();
        System.out.println(line.isGreater(line2,line1));
    }
}
