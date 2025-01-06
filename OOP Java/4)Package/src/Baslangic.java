//import java.util.Scanner;     // import edersek  main içindeki java.util.Scanner ı yazmamıza gerek kalmaz
import java.util.*;         //  * koyarsak Tüm package ı kullanır.
//import java.lang.Math;
import static java.lang.Math.*;



public class Baslangic 
{
	
	
	public static void main(String[] args) 
	{
		// 1.Yol 
		
		Scanner scanner = new Scanner(System.in);
		String ad; 
		ad = scanner.nextLine();
		System.out.println("Adınız: " + ad);
		
		
		// 2.Yol
		
//		java.util.Scanner okuyucu = new java.util.Scanner(System.in);
//		String ad2;
//		
//		System.out.printf("Lütfen adınızı giriniz: ");
//		ad2 = okuyucu.next();
		
//		System.out.println("Adınız " + ad);
		
		System.out.println("4'ün karekökü " + Math.sqrt(4));  // import java.lang.Math edilmeli
		System.out.println("4'ün karekökü " + sqrt(4));

		
	}

}

