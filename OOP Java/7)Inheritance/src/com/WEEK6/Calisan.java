package com.WEEK6;

public class Calisan extends Insan
{
	public String kurum;
	public int sgkId;
	
	
	public Calisan()
	{
		System.out.println("Default yapıcı Çalışan");
	}
	
	public Calisan(String kurum1, int sgkId1) 
	{
		System.out.println("Parametreli yapıcı Çalışan");
		this.kurum = kurum1;
		this.sgkId = sgkId1;
	}
	public Calisan(String isim1, int yas1, String kurum1, int sgkId1) 
	{
		super(isim1,yas1);
		System.out.println("Parametreli yapıcı Çalışan");
		this.kurum = kurum1;
		this.sgkId = sgkId1;
	
		
	}
	
	public void ozellikSoyle1()
	{
		super.ozellikSoyle();
		System.out.println("Kurum: " + this.kurum);
		System.out.println("sgkId: " + this.sgkId);
	}
	

}
