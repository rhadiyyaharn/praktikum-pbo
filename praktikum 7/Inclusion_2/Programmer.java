/*
* Nama File         : Programmer.java 
* Tanggal pembuatan : 03/05/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Subclass Programmer yang meng-extend class Pegawai serta method yang menampilkan nama dan total gaji programmer
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
