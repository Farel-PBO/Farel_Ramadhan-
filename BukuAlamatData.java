/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel16042026;
import farel16042026.BukuAlamat;
/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatData {
      BukuAlamat[] data = new BukuAlamat[5];   
      
    public void insert(BukuAlamat bukuAlamat, int index){
        data[index] = bukuAlamat;
     }
    
    public void update(BukuAlamat bukuAlamatBaru, int index){
        data[index] = bukuAlamatBaru;
    }
    
    public void delete(int index){
        data[index] = null;
    }
    
    public void view(){
        for(int i=0; i<data.length;  i++){
            if (data[i] !=null){
                System.out.println("Data ke-->" + (i+1));
                System.out.println("Nama          :"+data[i].getnama());
                System.out.println("Alamat        :"+data[i].getalamat());
                System.out.println("NO telepon    :"+data[i].getno_tlp());
                System.out.println("Email         :"+data[i].getemail());
            }
        }
    }
}
