package com.WEEK9;

public class Hakedis 
{
	public double brutMaas;
	public double vergiOrani;
		
	public Hakedis()
	{
		
	}
	
	public Hakedis(double brutMaas1, double vergiOrani1)
	{
		this.brutMaas = brutMaas1;
		this.vergiOrani = vergiOrani1;
	}
		
	public double getNetMaas() 
	{
		return this.brutMaas - vergiHesapla();
	}
	
	public double vergiHesapla()
	{
		return (this.brutMaas * this.vergiOrani / 100);
	}
}


