package com.WEEK11_Abstracts;

import com.YMH2003WEEK12_Interfaces.*;

public class Dortgen extends Sekil
					implements SekilHareket, Move
{
	private double kisaKenar;
	private double uzunKenar;
	
	public Dortgen()
	{
		
	}
	
	public Dortgen(double kisaKenar1, double uzunKenar1)
	{
		this.kisaKenar = kisaKenar1;
		this.uzunKenar = uzunKenar1;
	}
	
	// Extends
	
	public double alan()
	{
		return kisaKenar * uzunKenar;
	}
	
	public double cevre()
	{
		return 2 * (kisaKenar + uzunKenar);
	}
	
	// Interfaces
	
	public void hareket()
	{
		System.out.println("Hareket");
	}
	public void nerde()
	{
		System.out.println("Nerde");
	}
	public void move1()
	{
		System.out.println("Move 1");
	}
	public void move2()
	{
		System.out.println("Move 2");
	}
	public void move3()
	{
		System.out.println("Move 3");
	}
}

