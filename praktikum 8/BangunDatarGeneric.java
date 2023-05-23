/*
* Nama File			: BangunDatarGeneric.java 
* Tanggal Pembuatan : 17/05/2023
* Penulis			: Rhadiyyah Ariana Saraswati
* Deskripsi			: Kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}