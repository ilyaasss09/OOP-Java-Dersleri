
public class Ders 
{

	public String ad;
	public String kod;
	public static String bolum="Yazılım Mühendisliği";
	public Ders()
	{
		
	}
	
	public Ders(String ad1,String kod1)
	{
		this.ad = ad1;
		this.kod=kod1;
	}
	
	public Ders(Ders pDers)
	{
		this.ad=pDers.ad;
		this.kod=pDers.kod;
	}
	
	public Ders(String ad1)
	{
		this.ad = ad1; 
	}
	
	public void KendiniTanit()
	{
		System.out.println("Ders adi: "+this.ad+" Ders kodu: "+this.kod+" Bolüm: "+this.bolum);
	}
}
