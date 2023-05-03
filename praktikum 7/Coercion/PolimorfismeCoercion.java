/*
* Nama File         : MLingkaran.java 
* Tanggal pembuatan : 26/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Implementasi dari cara menghitung luas lingkaran
*/

public class PolimorfismeCoercion {
	
	public static int kuadrat(int bilangan) {
		return bilangan*bilangan;
	}
	
	public static void main(String[] args) {
		//deklarasi objek integer
		Integer bilangan = 10;
		
		//objek integer 'dipaksa' untuk diubah menjadi primitif
		int hasilKuadrat = kuadrat(bilangan.intValue());
		
		System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
	}
}
