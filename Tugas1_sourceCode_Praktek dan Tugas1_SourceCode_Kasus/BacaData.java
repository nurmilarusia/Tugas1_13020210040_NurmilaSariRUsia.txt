/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 08 Maret 2023*/

import java.util.Scanner;
public class BacaData{
	public static void main (String[ ] args) {
	int a;
	Scanner masukan;
	System.out.print ("Contoh membaca dan menulis, ketik nilai integer : \n");
	masukan = new Scanner (System.in);
	a= masukan.nextInt ();
	System.out.print ("Nilai yang dibaca : "+ a);

	}
}