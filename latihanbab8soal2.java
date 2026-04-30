/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.bab8_argument;

/**
 *
 * @author LAB-SI-PC
 */
public class latihanbab8soal2 {
    public static void main ( String[] args ){
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        
        int Sum = angka1 + angka2;
        int Difference = angka1 - angka2;
        int Product = angka1 * angka2;
        int Quotient = angka1 / angka2;
        
        System.out.println("Sum = "+ Sum);
        System.out.println("Difference = "+ Difference);
        System.out.println("Product = "+ Product);
        System.out.println("Quotient = "+ Quotient);
    }
}
