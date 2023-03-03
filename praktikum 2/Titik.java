/*
* Nama File : Titik.java 01/03/2023
* Penulis   : Rhadiyyah Ariana Saraswati
* Deskripsi : Kelas yang berisi realisasi untuk menjalankan kelas MTitik
*/

class Titik {
	private double absis;
	private double ordinat;
	static int counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double x, double y){
		absis = x; 
		ordinat = y;
		counterTitik++;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public int getCounterTitik(){
		return counterTitik;
	}

}