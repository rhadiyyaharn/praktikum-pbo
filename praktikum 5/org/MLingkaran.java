/*
* Nama File         : MLingkaran.java 
* Tanggal pembuatan : 26/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Implementasi dari cara menghitung luas lingkaran
*/

package org;

import java.util.Scanner; 

public class MLingkaran {
    public static void main(String[] args) {
        double jari2;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Input jejari : ");
        jari2 = userInput.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jari2);

        System.out.println("Luas lingkaran : " + lingkaran.hitungLuas());

    }
}