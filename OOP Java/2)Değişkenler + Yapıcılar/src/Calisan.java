
public class Calisan {
	
	public String ad;
	public String soyad;
	public String bolum;
	public int yas;
	public Calisan()
	{
		System.out.println("Çalışan default yapıcı");
	}

	
	public void kimsin()
	{
		
		System.out.println("Adım: " + this.ad);
		System.out.println("Soyadım: " + this.soyad);
		System.out.println("Bölümüm: " + this.bolum);
		System.out.println("Yaşım: " + this.yas);
		
	}
}
