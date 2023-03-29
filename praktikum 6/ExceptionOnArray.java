/*
* Nama File         : ExceptionOnArray.java 
* Tanggal pembuatan : 29/03/2023
* Penulis           : Rhadiyyah Ariana Saraswati
* Deskripsi         : Program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			// 0 1 2 3 4 
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}