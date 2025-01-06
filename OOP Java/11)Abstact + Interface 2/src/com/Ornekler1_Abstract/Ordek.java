package com.Ornekler1_Abstract;

import com.Ornekler1_Interface.*;

public class Ordek extends Yuzucu
					implements Ucan, Yuruyen
{
	private String renk;
	private double agırlık;
	
	public Ordek()
	{
		
	}
	
	public Ordek(String renk1, double agırlık1)
	{
		this.renk = renk1;
		this.agırlık = agırlık1;
	}
	
	public String yuz()
	{
		return "Yüzebiliyorum.";
	}
	
	public void uc()
	{
		System.out.println("Uçabiliyorum");
	}
	public void nerde()
	{
		System.out.println("Gölde");
	}
	
	public void yuru()
	{
		System.out.println("Yürüyorum.");
	}
	
	public void kos()
	{
		System.out.println("Koşuyorum.");
	}
}
