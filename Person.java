/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author LAB-SI-PC
 */
public class Person {
    protected String name; 
    protected String address; 

    public Person(){ 
        
        System.out.println("Inside Person:Constructor");
        name = "anna"; 
        address = "padang";   
    }  
    public Person( String name, String address ){
        this.name = name; 
        this.address = address;   
    }
    public String getName(){ 
    return name;  
    } 
    public String getAddress(){ 
    return address;  
    } 
    public void setName( String name ){ 
    this.name = name;  
    } 
    public void setAddress( String add ){ 
    this.address = add;  
 } 
}
    

