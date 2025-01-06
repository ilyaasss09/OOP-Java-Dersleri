package com.WEEK6;

public class Idari extends Calisan
{
	public int kurumSicilNo;
	
	
	public Idari()
	{
		System.out.println("Default yapıcı İdari");
	}
	
	public Idari(int kurumSicilNo1) 
	{
		System.out.println("Parametreli yapıcı İdari");
		this.kurumSicilNo = kurumSicilNo1;
	}
	
	public Idari(String isim1, int yas1,String kurum1, int sgkId1,int kurumSicilNo1) 
	{
		super(isim1,yas1,kurum1,sgkId1);
		System.out.println("Parametreli yapıcı İdari");
		this.kurumSicilNo = kurumSicilNo1;
	}
	
	public void ozellikSoyle13()
	{
		super.ozellikSoyle1();
		System.out.println("Kurum Sicil No: " + this.kurumSicilNo);
	}

}
