/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.bab7_array;

/**
 *
 * @author LAB-SI-PC
 */
public class LatihanBab7_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inisialisasi array String dengan 7 hari
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // 1. Menggunakan FOR-LOOP
        System.out.println("=== Menggunakan For-Loop ===");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        // 2. Menggunakan WHILE-LOOP
        System.out.println("\n=== Menggunakan While-Loop ===");
        int j = 0; // Inisialisasi counter
        while (j < days.length) {
            System.out.println(days[j]);
            j++; // Increment counter
        }

        // 3. Menggunakan DO-WHILE LOOP
        System.out.println("\n=== Menggunakan Do-While Loop ===");
        int k = 0; // Inisialisasi counter
        do {
            System.out.println(days[k]);
            k++; // Increment counter
        } while (k < days.length);
    }
}