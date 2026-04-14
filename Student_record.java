/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.dan.object;

/**
 *
 * @author LAB-SI-PC
 */
public class Student_record {
    private String Name;
    private String addres;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    public static int StudentCount;

    
    public Student_record(){ 
      StudentCount++;
    } 
    public Student_record(String temp){ 
    this.Name = temp; 
    } 
    
    public Student_record(String Name, String addre,int age){ 
    this.Name = Name; 
    this.addres = addres; 
    this.age = age;
    } 
    
    public Student_record(double mGrade, double eGrade, double sGrade){ 
    mathGrade = mGrade;  
    englishGrade = eGrade;  
    scienceGrade = sGrade;  
    } 
    
    public String getName(){
        return Name;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getaddres(){
        return addres;
    }
    
    public void setaddres(String addres){
        this.addres = addres;
    }
    
    public int getage(){
        return age;
    }
    
    public void setage (int age){
        this.age = age;
    }
    
    public double getmathGrade(){
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade) /3;
        return average;
    }
    
    public void setaverage(double average){
        this.average = average;
    }
    public static int getStudentCount(){
        return StudentCount;
    }
    
    public void print( String temp ){ 
    System.out.println("Name:" + Name); 
    System.out.println("Address:" + addres);  
    System.out.println("Age:" + age);  
    } 
    public void print(double eGrade, double mGrade, double sGrade){
    System.out.println("Name:" + Name); 
    System.out.println("Math Grade:" + mGrade);  
    System.out.println("English Grade:" + eGrade);  
    System.out.println("Science Grade:" + sGrade);  
    } 

}
