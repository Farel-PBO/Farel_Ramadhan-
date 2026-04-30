/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.bab7_array;

/**
 *
 * @author LAB-SI-PC
 */
public class latihanbab7_soal3 {
   public static void main(String[] args) {
        // Deklarasi array multidimensi yang benar
        String[][] entry = {
            {"Florence", "735-1234", "Manila"}, 
            {"Joyce", "983-3333", "Quezon City"}, 
            {"Becca", "456-3322", "Manila"}
        }; 

        // Melakukan iterasi untuk setiap baris di dalam array
        for (int i = 0; i < entry.length; i++) {
            // entry[i][0] adalah Nama
            // entry[i][1] adalah Telp
            // entry[i][2] adalah Alamat
            
            System.out.println("Name    : " + entry[i][0]);
            System.out.println("Tel. #  : " + entry[i][1]);
            System.out.println("Address : " + entry[i][2]);
            
            // Menambah baris kosong agar output rapi antar entri
            System.out.println(); 
        }
    }
} 
