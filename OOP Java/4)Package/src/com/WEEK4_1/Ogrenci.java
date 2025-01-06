package com.WEEK4_1;

public class Ogrenci 
{
	public int yas;
	public String name;
	
	
	public Ogrenci()
	{
		System.out.println("Öğrenci default yapıcı");
	}

	public Ogrenci(int yas1, String name1)
	{
		System.out.println("Öğrenci parametreli yapıcı");
		
		this.yas = yas1;
		this.name = name1;	
	}
	
	public Ogrenci(Ogrenci ogr1)
	{
		System.out.println("Öğrenci kopya yapıcı");
		this.yas = ogr1.yas;
		this.name = ogr1.name;
	}
	
	public void display()
	{
		System.out.println("Öğrenci adı: " + this.name);
		System.out.println("Öğrenci yaşı: " + this.yas);
	}
}
