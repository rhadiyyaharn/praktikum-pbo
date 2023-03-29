/*
* Nama File         : AngkaSialException.java 
* Tanggal pembuatan : 29/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukan angka 13 karena angka sial !!!");
	}
}