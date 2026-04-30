/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel16042026;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String no_tlp;
    private String email;
    
    public static int BukuAlamat;

    
    public BukuAlamat(){
      this("Ani");
      BukuAlamat++;
    } 
    public BukuAlamat(String temp){ 
    this.nama = temp; 
    BukuAlamat++;
    } 
    
    public BukuAlamat(String nama, String alamat,String no_tlp, String email){ 
    this.nama = nama; 
    this.alamat = alamat; 
    this.no_tlp = no_tlp;
    this.email = email;
    BukuAlamat++;
    } 
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getno_tlp(){
        return no_tlp;
    }
    
    public void setno_tlp(String no_tlp){
        this.no_tlp = no_tlp;
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void print( String temp ){ 
    System.out.println("Nama:" + nama); 
    System.out.println("Alamat:" + alamat);  
    System.out.println("no_tlp:" + no_tlp);
    System.out.println("Email:" + email);
    System.out.println("-------------------");
    } 
}
