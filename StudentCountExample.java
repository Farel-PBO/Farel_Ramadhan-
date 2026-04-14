/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.dan.object;

/**
 *
 * @author LAB-SI-PC
 */
public class StudentCountExample {
    public static void main (String[] args){
      Student_record aliRecord = new Student_record();   
      Student_record aniRecord = new Student_record();
      Student_record deniRecord = new Student_record("deni,Batusangkar,20");
      deniRecord.print("");
      
        System.out.println(" ");
        
        aliRecord.setName("Ali");
        aliRecord.setaddres("Padang");
        aliRecord.setage(20);
        aliRecord.setmathGrade(80);
        aliRecord.setenglishGrade(70);
        aliRecord.setscienceGrade(90);
        aliRecord.print("");
        
        System.out.println(" ");
                
        System.out.println("Data 1");
        System.out.println("Nama                  :" + aliRecord.getName());
        System.out.println("alamat                :" + aliRecord.getaddres());
        System.out.println("umur                  :" + aliRecord.getage());
        System.out.println("Matematika            :" + aliRecord.getmathGrade());
        System.out.println("B.Inggris             :" + aliRecord.getenglishGrade());
        System.out.println("Ilmu Pengetahuan      :" + aliRecord.getscienceGrade());
        System.out.println("Rata Rata             :" + aliRecord.getaverage());
        
        System.out.println(" ");
        
        aniRecord.setName("Ani");
        aniRecord.setaddres("Bukittinggi");
        aniRecord.setage(20);
        aniRecord.setmathGrade(80);
        aniRecord.setenglishGrade(70);
        aniRecord.setscienceGrade(90);
        aniRecord.print("");
        
        System.out.println(" ");
        
        System.out.println("Data 2");
        System.out.println("Nama                  :" + aniRecord.getName());
        System.out.println("alamat                :" + aniRecord.getaddres());
        System.out.println("umur                  :" + aniRecord.getage());
        System.out.println("Matematika            :" + aniRecord.getmathGrade());
        System.out.println("B.Inggris             :" + aniRecord.getenglishGrade());
        System.out.println("Ilmu Pengetahuan      :" + aniRecord.getscienceGrade());
        System.out.println("Rata Rata             :" + aniRecord.getaverage());
        
        System.out.println("Jumlah Siswa  ="+ Student_record.getStudentCount());
    }
    
    
    
}
