/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import person.Person;

/**
 *
 * @author LAB-SI-PC
 */
public class Student extends Person{
    public Student() {
       super( "anna", "Padang" );  
       System.out.println("Inside Student:Constructor");  
    } 

    /**
     *
     * @return
     */
    @Override
    public String getName() {
       System.out.println("getName() Student");
       return name;
    }
    
    public static void main(String[] args) {
        Student anna = new Student();
        System.out.println(anna.name);
        System.out.println(anna.address);
    }
}

