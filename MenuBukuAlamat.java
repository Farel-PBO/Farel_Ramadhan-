/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel16042026;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LAB-SI-PC
 */
public class MenuBukuAlamat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Menggunakan ArrayList agar bisa menyimpan banyak data
        ArrayList<BukuAlamat> daftarKontak = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n========= APLIKASI BUKU ALAMAT =========");
            System.out.println("1. Tambah Kontak Baru");
            System.out.println("2. Tampilkan Semua Kontak");
            System.out.println("3. Cari Kontak (Berdasarkan Nama)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu > ");

            // Mengambil input pilihan menu
            String pilihan = input.nextLine();

            // Struktur Switch Case
            switch (pilihan) {
                case "1":
                    System.out.print("Nama Lengkap   : ");
                    String nama = input.nextLine();
                    System.out.print("Alamat Lengkap : ");
                    String alamat = input.nextLine();
                    System.out.print("No. Telepon    : ");
                    String no_tlp = input.nextLine();
                    System.out.print("Email          : ");
                    String email = input.nextLine();

                    // Membuat objek dan memasukkan ke list
                    daftarKontak.add(new BukuAlamat(nama, alamat, no_tlp, email));
                    System.out.println("✓ Data berhasil ditambahkan!");
                    break;

                case "2":
                    System.out.println("\n--- DAFTAR KONTAK ---");
                    if (daftarKontak.isEmpty()) {
                        System.out.println("Buku alamat masih kosong.");
                    } else {
                        for (int i = 0; i < daftarKontak.size(); i++) {
                            BukuAlamat b = daftarKontak.get(i);
                            System.out.println((i + 1) + ". " + b.getnama() + " [" + b.getno_tlp() + "]");
                        }
                    }
                    break;

                case "3":
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    for (BukuAlamat b : daftarKontak) {
                        if (b.getnama().equalsIgnoreCase(cari)) {
                            System.out.println("\n--- Data Ditemukan ---");
                            System.out.println("Nama   : " + b.getnama());
                            System.out.println("Alamat : " + b.getalamat());
                            System.out.println("Email  : " + b.getemail());
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) System.out.println("Data tidak ditemukan.");
                    break;

                case "0":
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    running = false;
                    break;

                default:
                    System.out.println("⚠️ Pilihan tidak tersedia. Silakan masukkan 0-3.");
                    break;
            }
        }
        input.close();
    }
}

