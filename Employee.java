/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author LAB-SI-PC
 */
public class Employee extends Person {

    /**
     *
     * @return
     */
    @Override 
    public String getName() {
        System.out.println("getName() employee");
        return name;
    }
}
