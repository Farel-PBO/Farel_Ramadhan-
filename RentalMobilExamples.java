/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class RentalMobilExamples {

    public static void main(String[] args) {

        RentalMobilData data = new RentalMobilData();

        RentalMobil r1 = new RentalMobil("S01", "Farel", "Avanza", 3);
        RentalMobil r2 = new RentalMobil("S02", "Budi", "Fortuner", 7);

        data.tambahData(r1);
        data.tambahData(r2);

        System.out.println("=== CONTOH DATA ===");
        data.tampilSemua();
    }
}