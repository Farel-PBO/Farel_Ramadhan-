/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.bab7_array;

import javax.swing.JOptionPane;

public class latihanbab7_soal_2_jopointpane {
    
    public static void main(String[] args) {
        // 1. Inisialisasi array untuk menyimpan 10 nomor
        int[] numbers = new int[10];

        // 2. Input 10 nomor via dialog
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1));
            // Mengubah input String menjadi Integer
            numbers[i] = Integer.parseInt(input);
        }

        // 3. Cari angka terbesar
        int max = numbers[0]; // Asumsi awal: angka pertama adalah yang terbesar
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 4. Tampilkan hasil akhir
        JOptionPane.showMessageDialog(null, "Angka terbesar adalah: " + max);
    }
}