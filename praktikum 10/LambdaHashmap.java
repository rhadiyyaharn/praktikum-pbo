/* 
* File              : LambdaHashmap.java 
* Tanggal Pembuatan : 05/06/2023
* Penulis			: Rhadiyyah Ariana Saraswati
* Deskripsi         : Implementasi lambda pada Map, digunakan sebagai parameter pada method program diatas akan emnampilkan key sebagai NIM dan value sebagai Nama Mahasiswa
*/

import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<Long, String>();

        map.put(24060121130069L, "Rhadiyyah Ariana Saraswati");
        map.put(24060121130077L, "Prisca Della Budiman");
        map.put(24060121140015L, "Ririn Indah Cahyani");

        //lambda sebagai parameter
        map.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}