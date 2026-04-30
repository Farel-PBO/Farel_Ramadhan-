/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;

public class Pegawai {
    private String nik;
    private String nama;
    private String golongan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double gajiBersih;

    // Constructor
    public Pegawai(String nik, String nama, String golongan,
                   double gajiPokok, double tunjangan, double potongan) {
        this.nik = nik;
        this.nama = nama;
        this.golongan = golongan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        hitungGajiBersih();
    }

    // Method hitung gaji bersih
    public void hitungGajiBersih() {
        this.gajiBersih = gajiPokok + tunjangan - potongan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Golongan: ");
        String golongan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan Tunjangan: ");
        double tunjangan = input.nextDouble();

        System.out.print("Masukkan Potongan: ");
        double potongan = input.nextDouble();

        Pegawai p = new Pegawai(nik, nama, golongan, gajiPokok, tunjangan, potongan);

        System.out.println("\n=== Data Pegawai ===");
        System.out.println("Nama: " + p.getNama());
        System.out.println("Gaji Bersih: " + p.getGajiBersih());
    }
}