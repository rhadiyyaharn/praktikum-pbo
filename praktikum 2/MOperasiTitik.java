/*
* Nama File         : MOperasiTitik.java 
* Tanggal pembuatan : 01/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Kelas yang berisi program utama yang memanfaatkan kelas OperasiTitik
*/

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1 = new Titik(5.0 , 3.0);
		OperasiTitik op = new OperasiTitik();

		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");

		Titik t2 = op.refleksiX(t1);
		System.out.println("\nTitik setelah refleksi X");
		System.out.println("Titik("+t2.getAbsis()+","+t2.getOrdinat()+")");

		Titik t3 = op.refleksiY(t2);
		System.out.println("\nTitik setelah refleksi Y");
		System.out.println("Titik("+t3.getAbsis()+","+t3.getOrdinat()+")");	

	}
}