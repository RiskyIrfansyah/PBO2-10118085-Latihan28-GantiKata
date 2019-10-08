/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
  * Deskripsi Program : Ganti Kata
 */
public class PBO210118085Latihan28GantiKata {
    public static String kata, ganti, menjadi;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Program Mengganti Kata =======");
        System.out.printf("Masukan Kalimat : ");
        kata = scanner.nextLine();
        System.out.println("Ganti Kata : ");
        ganti = scanner.nextLine();
        System.out.printf("Menjadi Kata : ");
        menjadi = scanner.nextLine();
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal : " + kata );
        System.out.println("Kalimat Baru : " + kata.replace(ganti, menjadi));
    }
}