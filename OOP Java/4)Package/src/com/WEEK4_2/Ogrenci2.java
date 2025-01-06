package com.WEEK4_2;

public class Ogrenci2 
{
	public String ad;
	public int yas;
	
	public Ogrenci2()
	{
		System.out.println("Öğrenci default yapıcı");
		
	}

	public Ogrenci2(int yas1, String ad1)
	{
		System.out.println("Öğrenci parametreli yapıcı");
		
		this.yas = yas1;
		this.ad = ad1;
		
	}
	
	public Ogrenci2(Ogrenci2 ogr1)
	{
		System.out.println("Öğrenci kopya yapıcı");
		this.yas = ogr1.yas;
		this.ad = ogr1.ad;
		
	}
	
	public void display()
	{
		System.out.println("Öğrenci adı: " + this.ad);
		System.out.println("Öğrenci yaşı: " + this.yas);
	}

}

