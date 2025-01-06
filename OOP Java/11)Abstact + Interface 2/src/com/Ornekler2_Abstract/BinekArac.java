package com.Ornekler2_Abstract;
import com.Ornekler2_Interface.*;

public class BinekArac extends Arac
						implements AraziAraci, ElektrikliArac
{	
	private int koltukSayisi;
	
	public BinekArac()
	{
		
	}
	
	public BinekArac(int koltukSayisi1)
	{
		this.koltukSayisi = koltukSayisi1;
	}
	
	public String sur()
	{
		return "Sürüyorum.";
	}
	
	public String dur()
	{
		return "Duruyorum.";
	}
	
	public String yakitAl()
	{
		return "Yakıt Alıyorum.";
	}
	
	public void takviye()
	{
		System.out.println("Takviye Ekleniyor.");
	}
	public void dortxmod()
	{
		System.out.println("4x4 Modu etkin.");
	}
	public void sarjOl()
	{
		System.out.println("Şarj Ediliyor.");
	}
	
	public void koltukSayisi()
	{
		System.out.println(this.koltukSayisi + " Koltuklu.");
	}



}

