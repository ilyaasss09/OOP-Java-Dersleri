
public class Baslangic
{

	public static void main(String[] args) 
	{
		
		Ogretmen aOgretmeni=new Ogretmen();
		Ogretmen bOgretmeni=new Ogretmen(21,"Can");
		Ogretmen cOgretmeni=new Ogretmen("Hasan Can");
		Ogretmen dOgretmeni=new Ogretmen(bOgretmeni);
		
		Ders matematik=new Ders();
		Ders fen=new Ders("Fen","YMH3952");
		Ders java=new Ders(fen);
		
		
		
		cOgretmeni.dersVer();
		bOgretmeni.dersVer("Java");
		String ad1=bOgretmeni.ad;
		
		System.out.println("bOgretmeni adı "+bOgretmeni.ad);
		System.out.println("dOgretmeni adı "+dOgretmeni.ad);
		
		matematik.KendiniTanit();
		fen.KendiniTanit();
		java.KendiniTanit();
		
		
		
		Yeni yeni1 = new Yeni(23);
		yeni1.sayi = 32;
		yeni1.normalMethod();
		
		Yeni.deger = "Yepyeni değer";
		
		Yeni.staticMethod("Epeski değer");
		
		System.out.println(Yeni.deger);
		
		
		Uygulama uygulama1 = new Uygulama("ilyas");
		uygulama1.isim = "Onur";
		uygulama1.normalMethod("ilyas");



		Uygulama.deger = "Yeni değer";
		System.out.println(Uygulama.deger);
		
	}
}
