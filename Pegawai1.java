/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel_18062026;

/**
 *
 * @author LAB-SI-PC
 */
    
public class Pegawai1 {
    private String nip;
    private String nama;
    private String golongan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double gajiBersih;
    
    public Pegawai1(){
    }
    
    public Pegawai1(String nip, String nama, String golongan, double potongan) {
        this.nip = nip;
        this.nama = nama;
        this.golongan = golongan;
        this.potongan = potongan;
        hitungGaji(); 
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }



    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }


    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }


    public void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
    
    
   
    private void hitungGaji() {
        switch (golongan.toUpperCase()) {
            case "IIIA":
                this.gajiPokok = 2000000;
                break;
            case "IIIB":
                this.gajiPokok = 2500000;
                break;
            case "IIIC":
                this.gajiPokok = 3000000;
                break;
            default:
                this.gajiPokok = 0;
                break;
        }

        this.tunjangan = 0.10 * this.gajiPokok;
        this.gajiBersih = (this.gajiPokok + this.tunjangan) - this.potongan;
    }

    public void tampilkanData() {
        System.out.println("--- Data Pegawai ---");
        System.out.println("NIP          : " + nip);
        System.out.println("Nama         : " + nama);
        System.out.println("Golongan     : " + golongan);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Potongan     : Rp " + potongan);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        
        Pegawai1 P1= new Pegawai1("202401", "Budi Santoso", "IIIA", 44000);
        
        P1.tampilkanData();
    }
} 


