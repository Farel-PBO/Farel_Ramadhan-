/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

public class RentalMobilMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RentalMobilData data = new RentalMobilData();

        int pilih;

        do {
            System.out.println("\n=== MENU RENTAL MOBIL ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    RentalMobil r = new RentalMobil();

                    System.out.print("ID Sewa: ");
                    r.setIdSewa(input.nextLine());

                    System.out.print("Nama: ");
                    r.setNamaPenyewa(input.nextLine());

                    System.out.print("Jenis Mobil: ");
                    r.setJenisMobil(input.nextLine());

                    System.out.print("Lama Sewa: ");
                    r.setLamaSewa(input.nextInt());
                    input.nextLine();

                    r.hitungTotal();
                    data.tambahData(r);

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    data.tampilSemua();
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 3);

        input.close();
    }
}