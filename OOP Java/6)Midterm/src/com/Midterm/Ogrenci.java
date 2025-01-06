package com.Midterm;

public class Ogrenci extends Insan
{
	public int sId;
	public String bolum;
	public static String unvAdi = "METU";
	
	public Ogrenci()
	{
		System.out.println("DEfault yapıcı öğrenci");
	}
	
	public Ogrenci(int sId1,String bolum1)
	{
		System.out.println("parametreli yapıcı öğrenci");
		this.sId = sId1;
		this.bolum = bolum1;
	}
	
	public Ogrenci(int yas1, String name1,String soyisim1,int sId1,String bolum1)
	{
		super(yas1,name1,soyisim1);
		System.out.println("Parametreli overloaded öğrenci");
		this.sId = sId1;
		this.bolum = bolum1;
	}
	
	
	public void ozellikSoyle2()
	{
		super.ozellikSoyle();
		System.out.println("ID: " + this.sId);
		System.out.println("Bölüm: " + this.bolum);
		System.out.println("Üni adı: " + unvAdi);
		
	}
}
