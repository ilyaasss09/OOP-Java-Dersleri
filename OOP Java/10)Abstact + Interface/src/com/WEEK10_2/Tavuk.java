package com.WEEK10_2;

public class Tavuk extends Hayvan
					implements Kanatli,Memeli
					
{
	public int kanatSayisi;
	
	public Tavuk()
	{
		
	}
	
	public Tavuk(int kanatSayisi1)
	{
		this.kanatSayisi = kanatSayisi1;
	}
	
	public Tavuk(Tavuk tvk1)
	{
		this.kanatSayisi = tvk1.kanatSayisi;
	}
	 
	public void ozSoyle()
	{
		super.ozSoyle();
		System.out.println("Kanat Sayısı: " + this.kanatSayisi);
	}
	public void sayType()
	{
		System.out.println("Kanatlı");
	}
	
	public int sayNumber()
	{
		return 2;
	}
	
	public void sayHello()
	{
		System.out.println("hello");
	}
	
	

}
