package com.YMH2003WEEK9_2;

public class Baslat2 
{

	public static void main(String[] args) 
	{
		Musteri m1 = new Musteri();
		Calisan c1 = new Calisan();
		OzelMusteri om1 = new OzelMusteri();
		
		System.out.println("Müşteri Faiz Oranı: " + m1.faizOrani());
		System.out.println("Çalışan Faiz Oranı: " + c1.faizOrani());
		System.out.println("Özel Müşteri Faiz Oranı: " + om1.faizOrani());
	}

}
