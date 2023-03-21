/*
* Nama File         : BujurSangkar.java 
* Tanggal pembuatan : 15/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : representasi dari objek kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi = panjangSisi * panjangSisi * panjangSisi;
	}
	
	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
	
	public void printSisi(){
		System.out.println("Sisi Kubus : "+ permukaan.getPanjangSisi());
	}
}