/*
* Nama File         : Segitiga.java 
* Tanggal pembuatan : 08/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Representasi dari objek persegi panjang, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	public double alas, tinggi;
	
	public Segitiga(double alas,double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuasSegitiga(){
		return (alas * tinggi) / 2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga berisi "+this.getJumlahSisi());
	}
	
	
}
