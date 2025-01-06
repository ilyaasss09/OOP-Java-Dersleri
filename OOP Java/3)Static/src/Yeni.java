
public class Yeni 
{
	
	public int sayi;
	public static String deger = "Yeni sınıf değeri";
	
	
	public Yeni()
	{
		
	}
	
	public Yeni(int sayi1)
	{
		this.sayi = sayi1;
	}
	
	public static void staticMethod(String deger1)
	{
		deger = deger1;
	}
	
	public void normalMethod()
	{
		// deger = "Yeni";  static olmayan method static değişkenle çağrılabilir ama statik bir method yazıp çağırmak daha doğru olur.
		// staticMethod("yeni"); static olmayan method metod çağıramaz
		
		System.out.println("Sayı = " + sayi);	
	}
}
