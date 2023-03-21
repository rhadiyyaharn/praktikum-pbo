/*
* Nama File         : Poligon.java 
* Tanggal pembuatan : 15/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public void setJumlahSisi(int sisi){
		jumlahSisi = sisi;
	}
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}