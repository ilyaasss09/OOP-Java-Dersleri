
public class Hayvan 
{	
	public String tur;
	public double yas;
	public String cins;
	public int bacakSayisi;
	
	public Hayvan()
	{
		System.out.println("Hayvan default yapıcı");
	}
	
	public Hayvan(String tur1,double yas1, String cins1, int bacakSayisi1)
	{
		System.out.println("Hayvan parametreli yapıcı");
		
		this.bacakSayisi = bacakSayisi1;
		this.cins = cins1;
		this.tur = tur1;
		this.yas = yas1;
		
	}
	
	public void ozellikSoyle()
	{
		System.out.println("Tür: " + this.tur);
		System.out.println("Tür: " + this.yas);
		System.out.println("Tür: " + this.cins);
		System.out.println("Tür: " + this.bacakSayisi);

	}	
}
