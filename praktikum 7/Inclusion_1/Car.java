/*
* Nama File         : Car.java
* Tanggal pembuatan : 03/04/2023
* Penulis           : Rhadiyyah Ariana Saraswati
*/

public class Car extends Vehicle {
    void calRent(int jarak, float harga){
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
