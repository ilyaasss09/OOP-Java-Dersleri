
public class Baslat 
{

	public static void main(String[] args) 
	{
		Dortgen d1 = new Dortgen(4.7, 9);
		System.out.println("Çevre: " + d1.cevre());
		System.out.println("Alan: " + d1.alan());
		d1.alanHesapla();
		d1.hacimHesapla();
		d1.hareket();
		d1.fiziki();
		System.out.println();
		System.out.println("****************");
		System.out.println();
		Daire da1 = new Daire(7.5);
		System.out.println("Çevre: " + da1.cevre());
		System.out.println("Alan: " + da1.alan());
		da1.alanHesapla();
		da1.hacimHesapla();
		da1.hareket();
		da1.fiziki();
		System.out.println();
		System.out.println("****************");
		System.out.println();
		Ucgen u1 = new Ucgen(5,13,12,8);
		System.out.println("Çevre: " + u1.cevre());
		System.out.println("Alan: " + u1.alan());
		u1.alanHesapla();
		u1.hacimHesapla();
		u1.hareket();
		u1.fiziki();
	}

}
