package com.WEEK7;

public class Animal 
{
	public int numLegs;
	protected int numWings; //alt sınıflar protected a erişebilir ama diğer sınıflar erişemez main de dahil
	private double length;
	
	public Animal()
	{
		
	}
	
	public Animal(int numLegs1,int numWings)
	{
		this.numLegs = numLegs1;
		this.numWings = numWings;		
	}
	

}
