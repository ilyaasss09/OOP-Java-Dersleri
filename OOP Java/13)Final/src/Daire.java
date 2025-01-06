import com.Final_Abstracts.*;
import com.Final_Interfaces.*;

public class Daire extends Sekil
					implements Hareket, Hesap
{
	private double radius;
	
	public Daire()
	{
		
	}
	public Daire(double radius1)
	{
		this.radius = radius1;
	}
	
	public double cevre()
	{
		return 2 * Math.PI * radius;
	}
	
	public double alan()
	{
		return Math.PI * (radius * radius);
	}
	
	public void alanHesapla()
	{
		System.out.println("Dairenin Alanı: " + this.alan());
	}
	
	public void hacimHesapla()
	{
		System.out.println("Dairenin Hacmi Olmaz.");
	}
	
	public void hareket()
	{
		System.out.println("Daire Hareketi.");
	}
	
	public void fiziki()
	{
		System.out.println("Daire Fiziği.");
	}
}
