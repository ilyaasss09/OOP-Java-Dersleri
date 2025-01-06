package com.WEEK10_2;

public abstract class Hayvan  
{
	public int yas;
	
	public Hayvan()
	{
		
	}
	
	public Hayvan(int yas1)
	{
		this.yas = yas1;
	}
	
	public void ozSoyle()
	{
		System.out.println("Yaşım: " + this.yas);
	}
	
}
