/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 08 Maret 2023*/

public class Oper1 {
	public static void main(String[] args) {
	int n = 10; 	/* 1010 */
	int x = 1; 		/* 1 */
	int y = 2; 		/* 10 */

	System.out.println ("n = "+ n);
	System.out.println ("x = "+ x);
	System.out.println ("y = "+ y);

	/* 1010 AND 1000 */
	System.out.println("n & 8 = "+ (n & 8)); 
	
	/* 1 AND 0111 */ 
	System.out.println ("x & ~ 8 = "+ (x & ~8));
	
	/*10==> 1000 = 8 */ 
	System.out.println ("y << 2 = "+ (y << 2)); 

	/*10 ==>0000 = 0 */
	System.out.println ("y >> 3 = "+ (y >>3)); 
	}
}