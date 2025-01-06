package com.odev;

public class Computer 
{
	private int ram;
	private int screenSize;
	public String processor;
	
	public int getRam()
	{
		return this.ram;
	}
	
	public int getScreenSize()
	{
		return this.screenSize;
	}
	
	public void setRam(int ram1)
	{
		this.ram = ram1;
	}
		
	public void setScreenSize(int screenSize1)
	{
		this.screenSize = screenSize1;
	}
	
	
	public void display()
	{
		System.out.println("Public değişken");
		System.out.println("İşlemci: " + this.processor);
	}
}
