package com.WEEK4_2;

public class OgretimUyesi 
{
	public String ad;
	public int yas;
	
	public OgretimUyesi()
	{
		System.out.println("Öğretim Üyesi default yapıcı");
		
	}

	public OgretimUyesi(int yas1, String ad1)
	{
		System.out.println("Öğretim Üyesi parametreli yapıcı");
		
		this.yas = yas1;
		this.ad = ad1;
		
	}
	
	public OgretimUyesi(OgretimUyesi ogr1)
	{
		System.out.println("Öğretim Üyesi kopya yapıcı");
		this.yas = ogr1.yas;
		this.ad = ogr1.ad;
		
	}
	
	public void display()
	{
		System.out.println("Öğretim Üyesi adı: " + this.ad);
		System.out.println("Öğretim Üyesi yaşı: " + this.yas);
	}

}
