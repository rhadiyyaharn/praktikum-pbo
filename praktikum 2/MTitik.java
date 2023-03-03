/*
* Nama File   : MTitik.java 22/02/2023
* Penulis     : Rhadiyyah Ariana Saraswati
* Deskripsi   : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

class MTitik
{

	public static void main(String[] atgs)
	{
		Titik t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		Titik t2 = new Titik();
		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);

		Titik t3 = new Titik(5.0,6.0);

		int counterTitik = t1.getCounterTitik();

		System.out.println("Jumlah objek titik" + counterTitik);
		System.out.println("t1("+t1.getAbsis()+"," + t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+"," + t2.getOrdinat()+")");
		System.out.println("t3("+t3.getAbsis()+"," + t3.getOrdinat()+")");
		
	}
}