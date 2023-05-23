/*
* Nama File			: BangunDatarGenericTest.java 
* Tanggal Pembuatan : 17/05/2023
* Penulis			: Rhadiyyah Ariana Saraswati
* Deskripsi			: Main class untuk generic bangun datar
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg =
				new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("keliling lingkaran : "
									+bdg.hitungKeliling());
		System.out.println("tipe generic : "
							+bdg.get().getClass().getName());
	}
}