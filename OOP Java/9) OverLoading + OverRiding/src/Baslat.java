import com.WEEK9.*;
public class Baslat 
{

	public static void main(String[] args) 
	{
		
		
		Hakedis  h1 = new Hakedis(10000,5);
		System.out.println("Net maaş: " + h1.getNetMaas() + " TL");
		System.out.println("Vergi Miktarı: " + h1.vergiHesapla() + " TL");
	
	
	}

}
