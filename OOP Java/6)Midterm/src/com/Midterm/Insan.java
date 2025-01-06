package com.Midterm;

public class Insan 
{
	public int yas;
	public String name;
	public static int aSayisi = 2;
	private String soyisim;
	
	
	public Insan()
	{
		System.out.println("Default yapıcı Insan");
	}
	
	public Insan(int yas1, String name1,String soyisim1)
	{
		System.out.println("Parametreli yapıcı Insan");
		this.yas = yas1;
		this.name = name1;
		this.soyisim = soyisim1;
	}
	
	public Insan(Insan ins)
	{
		System.out.println("Kopya yapıcı Insan");
		this.yas = ins.yas;
		this.name = ins.name;
		this.soyisim = ins.soyisim;
	}
	
	public void ozellikSoyle()
	{
		System.out.println("Yaş: " + this.yas);
		System.out.println("Ad: " + this.name);
		System.out.println("soyAd: " + this.soyisim);
	}
	
	public static void staticOzellikSoyle()
	{
		System.out.println("Ayak sayısı: " + aSayisi);
	}
	
	public String getSoy()
	{
		return this.soyisim;
	}
	
	public void setSoy(String soyisim1)
	{
		this.soyisim = soyisim1;
	}
	
	
	
	

}
