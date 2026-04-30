/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobil {

    private String idSewa;
    private String namaPenyewa;
    private String jenisMobil;
    private int lamaSewa;
    private double hargaSewa;
    private double biayaTambahan; // diskon
    private double totalBayar;

    public RentalMobil() {}

    public RentalMobil(String idSewa, String namaPenyewa, String jenisMobil, int lamaSewa) {
        this.idSewa = idSewa;
        this.namaPenyewa = namaPenyewa;
        setJenisMobil(jenisMobil);
        this.lamaSewa = lamaSewa;
        hitungTotal();
    }

    // Getter & Setter
    public String getIdSewa() { return idSewa; }
    public void setIdSewa(String idSewa) { this.idSewa = idSewa; }

    public String getNamaPenyewa() { return namaPenyewa; }
    public void setNamaPenyewa(String namaPenyewa) { this.namaPenyewa = namaPenyewa; }

    public String getJenisMobil() { return jenisMobil; }
    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil.toLowerCase();
    }

    public int getLamaSewa() { return lamaSewa; }
    public void setLamaSewa(int lamaSewa) { this.lamaSewa = lamaSewa; }

    public double getHargaSewa() { return hargaSewa; }
    public double getBiayaTambahan() { return biayaTambahan; }
    public double getTotalBayar() { return totalBayar; }

    // Proses
    public void hitungTotal() {

        if (jenisMobil.equals("avanza")) hargaSewa = 300000;
        else if (jenisMobil.equals("innova")) hargaSewa = 500000;
        else if (jenisMobil.equals("fortuner")) hargaSewa = 800000;
        else hargaSewa = 0;

        double biayaSewa = hargaSewa * lamaSewa;

        if (lamaSewa > 5) {
            biayaTambahan = 0.1 * biayaSewa;
        } else {
            biayaTambahan = 0;
        }

        totalBayar = biayaSewa - biayaTambahan;
    }

    public void tampil() {
        System.out.println("ID Sewa      : " + idSewa);
        System.out.println("Nama         : " + namaPenyewa);
        System.out.println("Mobil        : " + jenisMobil);
        System.out.println("Lama Sewa    : " + lamaSewa);
        System.out.println("Diskon       : " + biayaTambahan);
        System.out.println("Total Bayar  : " + totalBayar);
    }
}