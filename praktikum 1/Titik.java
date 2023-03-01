/*
* Nama File : Titik.java 22/02/2023
* Penulis   : Rhadiyyah Ariana Saraswati
* Deskripsi : Kelas yang berisi realisasi untuk menjalankan kelas MTitik
*/

class Titik {
	double absis;
	double ordinat;
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

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	static int getCounterTitik(){
		return counterTitik;
	}

}