
public class Ogretmen 
{
	public int yas;
	public String ad;
	
	public Ogretmen()
	{
		System.out.println("Ogretmen varsayılan yapıcı");
	}
	
	public Ogretmen(int yas1,String ad1)
	{
		System.out.println("Ogretmen parametreli yapıcı");
		this.ad = ad1;
		this.yas = yas1;
	}
	
	//Yapıcı aşırı yükleme
	public Ogretmen(String ad1)
	{
		System.out.println("Ogretmen parametreli aşırı yüklenen yapıcı");
		this.ad = ad1;
	}
	
	//Kopya yapıcı
	public Ogretmen(Ogretmen pOgretmen)
	{
		this.ad = pOgretmen.ad;
		this.yas =pOgretmen.yas;
	}
	
	public void dersVer()
	{
		System.out.println("Ders verme işlemi tamamlandı");
	}
	
	//aşırı yüklenen metod
	public void dersVer(String dersAdi)
	{
		System.out.println(dersAdi+" Dersi verildi");
	}
	
}
