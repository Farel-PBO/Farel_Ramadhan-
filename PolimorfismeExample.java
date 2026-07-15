/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author LAB-SI-PC
 */
public class PolimorfismeExample {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee employee = new Employee();
        
        ref = student;
        System.out.println(ref.getName());
        
        ref = employee;
        System.out.println(ref.getName());
    }
    
       public static void main(String[] args){
        Student student = new Student();
        Employee employee = new Employee()
        printInformation(student);
        employee.name = "Budi";
        employee.address = "Padang";
        printInformation(employee);
              
    }
    
    public static void printInformation ( Person p ){
        System.out.println("Nama     :" + p.getName());
        System.out.println("Alamat     :" + p.getAddress());
    }
}
