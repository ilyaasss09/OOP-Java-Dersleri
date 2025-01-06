import com.WEEK6.*;

public class Baslat 
{

	public static void main(String[] args) 
	{
		System.out.println("*****/ İnsan Bilgileri *****/");
		Insan ins = new Insan("ilyas",20);
		ins.setYas(21);
		ins.ozellikSoyle();
		
		System.out.println("\n*****/ İnsan Öğrenci Bilgileri *****/");
		Ogrenci ogr1 = new Ogrenci("onur",13,"ortaokul",369);
		ogr1.ozellikSoyle2();
		
		System.out.println("\n*****/ İnsan Akademik Bilgileri *****/");
		Akademik akd1 = new Akademik("ilyas",20,"Üniversite",13241324,"Doçent");
		akd1.ozellikSoyle12();

		System.out.println("\n*****/ İnsan İdari Bilgileri *****/");
		Idari idareci = new Idari("Alperen",39,"Lise",143124,999);
		idareci.ozellikSoyle13();

		ogr1.isim = "ilyas";
		ogr1.okul = "Üniversite";
		ogr1.okulId = 12451251;
		ogr1.setYas(20);
		
		
		 
		

		
		
		

	}

}
