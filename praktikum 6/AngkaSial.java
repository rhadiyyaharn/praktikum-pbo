/*
* Nama File         : AngkaSial.java 
* Tanggal pembuatan : 29/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/*
*Ketika eksepsi terjadi, apakah baris 13 pada AngkaSial.java di atas dieksekusi? 
Tidak, baris 13 tidak dieksekusi ketika eksepsi terjadi karena kendali program 
sudah pindah ke blok catch setelah throw pada baris 8 dilakukan. Ketika eksepsi 
terjadi pada baris 8, program akan langsung melempar objek AngkaSialException dan 
kemudian blok catch akan menangkapnya dan menjalankan kode yang ada di dalamnya. 
Setelah blok catch selesai dieksekusi, program akan melanjutkan eksekusi pada baris 
berikutnya setelah blok catch, yaitu baris 14.

*Apakah baris 22 pada AngkaSial.java di atas dieksekusi?
Ya, baris 22 pada program AngkaSial.java akan dieksekusi jika tidak terjadi eksepsi. 
Setelah menjalankan metode cobaAngka() dengan argumen 12 pada baris 21, program akan 
melanjutkan eksekusi pada baris 22 dan mencetak "12 bukan angka sial".
*/