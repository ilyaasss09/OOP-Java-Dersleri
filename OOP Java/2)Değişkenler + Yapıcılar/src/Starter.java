
public class Starter 
{

	public static void main(String[] args) 
	{
		
		Student ogrenci = new Student("İlyas","Bakkal",21);
		Oyuncu oyuncu1 = new Oyuncu();
		Calisan gorevli = new Calisan();
		
		
		Hayvan aslan = new Hayvan("Yırtıcı", 5.9 , "Memeli" , 4 );
		Araba arac = new Araba("Antara","Opel",10);
		Ders derslik = new Ders("ilyas","mühendislik",6,"yazılım mühendisliği");
		
		
		ogrenci.ad = "İlyas";
		ogrenci.soyad="Bakkal";
		ogrenci.yas=21;
		
		oyuncu1.ad = "Icardı";
		oyuncu1.takimAdi = "Galatasaray";
		oyuncu1.maas = 2000;
		
		gorevli.ad = "İlyas";
		gorevli.soyad = "Bakkal";
		gorevli.bolum = "Yazılım Mühnedisliği";
		gorevli.yas = 20;
		
		
		ogrenci.kimsin();
		oyuncu1.kimsin();
		gorevli.kimsin();
		
		aslan.bacakSayisi = 3;
		aslan.ozellikSoyle();
		
		arac.ozellikSoyle();
		
		derslik.ozellikSoyle();

	}
}
