/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 08 Maret 2023*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.*;

public class Bacakar {
	public static void main (String[ ] args) throws IOException {
	
	char cc;
	int bil;

	InputStreamReader isr = new
	InputStreamReader (System.in);
	
	BufferedReader dataIn = new BufferedReader (isr);
//atau
	BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

	System.out.print ("hello\n");
	System.out.print ("baca satu karakter : ");
	
	cc=dataIn.readLine().charAt (0);
	System.out.print ("baca 1 bilangan : ");

	bil=Integer.parseInt (dataIn.readLine());

	/*String kar = JOptionPane.showInputDialog("Karakter 1 : "); 
	System.out.println(kar);*/
	//JOptionPane.showMessageDialog(null,"hello");

	System.out.print (cc +"\n" +bil+"\n"); System.out.print ("bye \n");
	
	}
}