package com.WEEK6;

public class Ogrenci extends Insan
{
	public String okul;
	public int okulId;
	
	
	public Ogrenci()
	{
		System.out.println("Default yapıcı öğrenci");
	}
	
	public Ogrenci(String okul1, int okulId1)
	{
		System.out.println("Parametreli yapıcı öğrenci");
		this.okul = okul1;
		this.okulId = okulId1;
	}
	
	public Ogrenci(String isim1,int yas1,String okul1, int okulId1)
	{
		super(isim1,yas1);
		System.out.println("Parametreli yapıcı öğrenci");
		this.okul = okul1;
		this.okulId = okulId1;
	}
	
	public void ozellikSoyle2()
	{
		super.ozellikSoyle();
		System.out.println("Okul: " + this.okul);
		System.out.println("Okul ID: " + this.okulId);
	}
	
	

}
