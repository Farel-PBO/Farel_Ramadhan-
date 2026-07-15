/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel_18062026;

/**
 *
 * @author LAB-SI-PC
 */
public class Mahasiswa {
    private String Nim;
    private String Nama;
    private String Alamat;
    
    public Mahasiswa(){
    }

    public Mahasiswa(String Nim, String Nama, String Alamat) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public String getNim() {
        return Nim;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

  

    
   
}
