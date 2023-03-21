/*
* Nama File         : BujurSangkar.java 
* Tanggal pembuatan : 15/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : representasi dari objek bujur sangkar, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.*;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}