import com.Midterm.*;

public class Baslat 
{

	public static void main(String[] args) 
	{
		Insan ogrenci = new Insan();
		Insan ogrenci2 = new Insan(21,"ilyas","Bakkal");
		Insan ogrenci3 = new Insan(ogrenci2);
		Ogrenci yzlogrenci = new Ogrenci(18,"ali","ak",1269,"yazılım");
		
		ogrenci.name = "Onur";
		ogrenci.yas = 18;
		ogrenci2.setSoy("Korkmaz");
		ogrenci2.ozellikSoyle();
		yzlogrenci.ozellikSoyle2();
		Insan.aSayisi = 3; 
		Insan.staticOzellikSoyle();
		
		
	}

}
