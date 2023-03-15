/*
* Nama File         : MTimSepakbola.java 
* Tanggal pembuatan : 15/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Kelas yang berisi program utama yang memanfaatkan kelas TimSepakbola
*/

class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
    TimSepakbola liverpool = new TimSepakbola("Liverpool");
	
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    TimSepakbola manchesterUnited = new TimSepakbola("Manchester United");

    // TODO: call startTandingBola()
	System.out.println("Pertandingan antara " + liverpool.nama + " dan " + manchesterUnited.nama + " dimulai!\n");	

	// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
      liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.getSkor() + " - " + manchesterUnited.getSkor() + " " + manchesterUnited.nama);
    }

	// TODO: call endTandingBola()
	System.out.println("\nPertandingan antara " + manchesterUnited.nama + " dan " + liverpool.nama + " selesai!");
    manchesterUnited.endTandingBola();
    liverpool.endTandingBola();
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/
