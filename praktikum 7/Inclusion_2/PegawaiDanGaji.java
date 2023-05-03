/*
* Nama File         : PegawaiDanGaji.java 
* Tanggal pembuatan : 03/05/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Program untuk menginisialisasi objek-objek dari kelas Pegawai, Programmer, dan Manajer
*/

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
