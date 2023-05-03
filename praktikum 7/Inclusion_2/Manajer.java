/*
* Nama File         : Manajer.java 
* Tanggal pembuatan : 03/05/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Subclass Manajer yang meng-extend class Pegawai serta method yang menampilkan nama dan total gaji manajer
*/

public class Manajer extends Pegawai {
    private int tunjangan = 7000000;

    public Manajer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
