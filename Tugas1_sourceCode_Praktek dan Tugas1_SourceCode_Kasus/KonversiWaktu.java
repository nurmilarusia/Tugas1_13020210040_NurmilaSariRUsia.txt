/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 08 Maret 2023*/

import java.util.Scanner;

public class KonversiWaktu{
	public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	System.out.print ("\nMasukkan total detik : ");
	int detik = sc.nextInt();

	//Menghitung detik sekarang
	int des = detik % 3600 %60;
	//Menghitung total menit
	int tom= detik/60;
	//Menghitung menit sekarang
	int mes = detik % 3600 /60;
	//Menghitung total jam
	int toj = detik/3600;
	//Menghitung jam sekarang
	int jas = toj %24;

		System.out.println ("Detik sekarang	: "+ des+" detik");
		System.out.println ("Total menit	: "+tom+ " menit");
		System.out.println ("Menit sekarang	: "+mes+ " menit");
		System.out.println ("Total jam	: "+toj+" jam");
		System.out.println ("Jam Sekarang	: "+jas+" jam");

	//Tampil waktu
	System.out.println("\nWaktu ("+jas+":"+mes+ ":"+des+")"); 
	
	}
}