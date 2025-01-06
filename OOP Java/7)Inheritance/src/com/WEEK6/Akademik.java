package com.WEEK6;

public class Akademik extends Calisan
{
	public String unvan;
	
	
	
	public Akademik()
	{
		System.out.println("Default yapıcı Akademik");
	}
	
	public Akademik(String unvan1) 
	{
		System.out.println("Parametreli yapıcı Akademik");
		this.unvan = unvan1;
	}
	public Akademik(String isim1, int yas1,String kurum1, int sgkId1, String unvan1) 
	{
		super(isim1,yas1,kurum1,sgkId1);
		System.out.println("Parametreli yapıcı Akademik");
		this.unvan = unvan1;
	}
	
	
	public void ozellikSoyle12()
	{
		super.ozellikSoyle1();
		System.out.println("Unvan: " + this.unvan);
	}
	

}
