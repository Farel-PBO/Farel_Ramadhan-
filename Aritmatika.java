/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.bab8_argument;

/**
 *
 * @author LAB-SI-PC
 */
public class Aritmatika {
    int tambah(int a,int b) {
        int c = a+b;
        return c;
    }
    
    public static void main (String[] args){
        Aritmatika aritmatika = new Aritmatika();
        int a = aritmatika.tambah(12, 10);
        System.out.print("hasil "+ a); 
    
    
        if(a %2 != 0){
           System.out.println(" = bilangan ganjil");
        }else {
           System.out.println(" = bilangan genap");
        }
    }
    
}
