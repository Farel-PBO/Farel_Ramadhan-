/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel16042026;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatExample {
    
    public static void main(String[] args){
        BukuAlamatData data = new BukuAlamatData();
        BukuAlamat bukuAlamat = new BukuAlamat();
        bukuAlamat.setnama("Ali");
        bukuAlamat.setalamat("Padang");
        bukuAlamat.setno_tlp("0878254364");
        bukuAlamat.setemail("ali@coba.com");
        data.insert(bukuAlamat, 0);
        bukuAlamat = new BukuAlamat();
        bukuAlamat.setnama("Budi");
        bukuAlamat.setalamat("Padang");
        bukuAlamat.setno_tlp("0878254364");
        bukuAlamat.setemail("budi@coba.com");
        data.insert(bukuAlamat, 1);
        data.delete(1);
        data.view();
    }
}
