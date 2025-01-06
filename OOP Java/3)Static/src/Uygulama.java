
public class Uygulama 
{
	public String isim;
	public static String deger ="ilk değerimiz";
	
	
	public Uygulama()
	{
		System.out.println("Default yapıcı");  // default yapıcı
		
	}
	
	public Uygulama(String isim1)
	{
		System.out.println("Parametreli yapıcı");  // parametreli yapıcı
		this.isim = isim1;
		
	}
	
	public Uygulama(Uygulama pUygulama)
	{
		System.out.println("Kopya uygulama");  // kopya yapıcı
		this.isim = pUygulama.isim;
		
	}
	
	public static void staticMethod(String deger1)
	{
		deger = deger1;
		
	}
	
	public void normalMethod(String isim)
	{
		System.out.println("isim: " + isim);
	}
}
