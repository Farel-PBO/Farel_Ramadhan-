/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.util.ArrayList;

public class RentalMobilData {

    private ArrayList<RentalMobil> daftar = new ArrayList<>();

    public void tambahData(RentalMobil r) {
        daftar.add(r);
    }

    public void tampilSemua() {
        if (daftar.isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            for (RentalMobil r : daftar) {
                r.tampil();
                System.out.println("------------------");
            }
        }
    }
}