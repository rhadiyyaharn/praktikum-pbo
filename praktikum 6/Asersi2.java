/*
* Nama File         : Asersi2.java 
* Tanggal pembuatan : 29/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Program untuk demo asesi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

//class lingkaran
class Lingkaran{
	private doublle jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = " + kelilingLingkaran);
	}
}

/*
* secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 

* Ya, ada yang kurang tepat pada program Asersi2 di atas. Pada baris ke-21, 
variabel jariJari diinisialisasi dengan nilai 0, sedangkan pada baris ke-13 
pada class Lingkaran, variabel jariJari harus memiliki nilai yang lebih besar 
dari 0 agar bisa menghitung keliling lingkaran dengan benar.

Karena itu, pada baris ke-14, digunakan sebuah assertion untuk memastikan 
bahwa nilai jariJari lebih besar dari 0 sebelum membuat objek Lingkaran. Namun, 
assertion ini tidak akan pernah terpenuhi karena variabel jariJari diinisialisasi 
dengan nilai 0 pada baris ke-21, sehingga program akan selalu menghasilkan nilai 
keliling lingkaran yang salah.

Untuk memperbaiki kesalahan ini, kita perlu menginisialisasi variabel jariJari 
dengan nilai yang lebih besar dari 0, misalnya 1.
*/