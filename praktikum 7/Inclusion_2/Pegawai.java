/*
* Nama File         : Pegawai.java 
* Tanggal pembuatan : 03/05/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Kelas abstract yang merupakan parent dari kelas-kelas lainnya yang berisi atribut nama dan gajiPokok dan method 
*/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
