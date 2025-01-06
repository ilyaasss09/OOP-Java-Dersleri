
public class Ders 
{	
	public String ad;
	public String fakulte;
	public int akts;
	public String bolum;
	
	public Ders()
	{
		System.out.println("Ders default yapıcı");
	}

	public Ders(String ad1, String fakulte1, int akts1, String bolum1)
	{
		System.out.println("Ders parametreli yapıcı");
		
		this.ad = ad1;
		this.fakulte = fakulte1;
		this.akts = akts1;
		this.bolum = bolum1;
		
	}
	
	public void ozellikSoyle()
	{
		System.out.println("Ad: " + this.ad);
		System.out.println("Fakülte: " + this.fakulte);
		System.out.println("AKTS: " + this.akts);
		System.out.println("Bölüm: " + this.bolum);
		
	}
}
