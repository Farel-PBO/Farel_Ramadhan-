/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author LAB-SI-PC
 */
public class ComputerStudentRecord extends Student_record {
    private String computerSkill;
    private String programmingLanguage;

    public ComputerStudentRecord() {
        super();
    }

    public ComputerStudentRecord(String name, String address, int age,
                                 String computerSkill,
                                 String programmingLanguage) {
        super(name, address, age);
        this.computerSkill = computerSkill;
        this.programmingLanguage = programmingLanguage;
    }

    public String getComputerSkill() {
        return computerSkill;
    }

    public void setComputerSkill(String computerSkill) {
        this.computerSkill = computerSkill;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Override method print()
    @Override
    public void print(String temp) {
        System.out.println("Name : " + getName());
        System.out.println("Address : " + getaddres());
        System.out.println("Age : " + getage());
        System.out.println("Computer Skill : " + computerSkill);
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

