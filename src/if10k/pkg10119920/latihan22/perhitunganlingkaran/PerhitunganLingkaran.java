/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class PerhitunganLingkaran {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double diameter, jari, luas, keliling;
        final double phi = 3.14;
        boolean check;
        
        System.out.println("======Perhitungan Lingkaran====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) 
        {
            try {
                diameter = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        jari = diameter / 2;
        luas = phi * jari * jari;
        keliling = phi * 2 * jari;
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        System.out.printf("Jari-jari Lingkaran\t\t= %.2f%n", jari);
        System.out.printf("Luas Lingkaran\t\t\t= %.2f%n", luas);
        System.out.printf("Keliling lingkaran\t\t= %.2f%n", keliling);
    }
}