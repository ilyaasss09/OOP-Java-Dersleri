package com.WEEK6;

public class Insan 
{
	public String isim;
	private int yas;
	
	public Insan()
	{
		System.out.println("Default yapıcı Insan");
	}
	
	public Insan(String isim1,int yas1)
	{
		System.out.println("Parametreli Insan yapıcı");
		this.isim = isim1;
		this.yas = yas1;
	}
	
	public Insan(Insan Insan1)
	{
		System.out.println("Kopya Insan yapıcı");
		this.isim = Insan1.isim;
	}
	
	public int getYas()
	{
		return this.yas;
	}
	 
	public void setYas(int yas1)
	{
		this.yas = yas1;
		this.yasDegistir(yas1);
	}
	
	private void yasDegistir(int yas1)
	{
		this.yas = yas1;
	}
	
	
	public void ozellikSoyle()
	{
		System.out.println("Adım: " + this.isim);
		System.out.println("Yaşım: " + this.yas);
	}
}














