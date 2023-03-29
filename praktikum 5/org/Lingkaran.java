/*
* Nama File         : Lingkaran.java 
* Tanggal pembuatan : 26/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Class implementasi IArea yaitu dengan cara menghitung luas lingkaran
*/

package org;

import static java.lang.Math.PI;

public class Lingkaran{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}