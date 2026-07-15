/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel_18062026;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiExample extends Mahasiswa  {
    public static void main(String[] args){
        MahasiswaNilai m = new MahasiswaNilai();
        m.setNim("2501092010");
        m.setNama("Farel");
        m.setAlamat("Padang");
        m.setTugas(80.0);
        m.setUts(70.0);
        m.setUas(80.0);
        
        System.out.println("Nim    : "+ m.getNim());
        System.out.println("Nama    : "+ m.getNama());
        System.out.println("Alamat    : "+ m.getAlamat());
        System.out.println("Tugas    : "+ m.getTugas());
        System.out.println("Uas    : "+ m.getUas());
        System.out.println("Uts    : "+ m.getUts());
    }
}
