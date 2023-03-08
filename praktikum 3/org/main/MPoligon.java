/*
* Nama File         : MPoligon.java 
* Tanggal pembuatan : 08/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : driver class untuk poligon dan persegi panjang
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		System.out.println("--Persegi Panjang--");
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		
		System.out.println("\n--Segitiga--");
		Segitiga segitiga = new Segitiga(10, 30, 3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuasSegitiga());
		
	}
}