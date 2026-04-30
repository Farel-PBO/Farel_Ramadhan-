package latihan.bab7_array;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihanbab7_soal_2 {
   // Menambahkan 'throws IOException' agar tidak perlu blok try-catch
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        
        // Input 10 nomor
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        // Cari angka terbesar
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Angka terbesar: " + max);
    }
}

