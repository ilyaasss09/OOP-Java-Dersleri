
public class Oyuncu 
{
	public String ad;
	public String takimAdi;
	public double maas;
	
	public Oyuncu()
	{
		System.out.println("Oyuncu default yapıcı ");
	}
	
	public void kimsin()
	{
		System.out.println("Adım : "+this.ad);
		System.out.println("Takımının Adı : "+this.takimAdi);
		System.out.println("Maaşım : "+this.maas);
		
	}
}
