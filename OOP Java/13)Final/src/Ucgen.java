import com.Final_Abstracts.*;
import com.Final_Interfaces.*;

public class Ucgen extends Sekil
					implements Hareket, Hesap
{
	private double kenar1;
	private double kenar2;
	private double tabanKenar;
	private double yukseklik;
	
	public Ucgen()
	{
		
	}
	
	public Ucgen(double kenar1, double kenar2, double tabanKenar1, double yukseklik1)
	{
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
		this.tabanKenar = tabanKenar1;
		this.yukseklik = yukseklik1;
	}
	
	public double cevre()
	{
		return kenar1 + kenar2 + tabanKenar;
	}
	
	public double alan()
	{
		return (tabanKenar * yukseklik) / 2;
	}
	
	public void alanHesapla()
	{
		System.out.println("Üçgenin Alanı: " + this.alan());
	}
	
	public void hacimHesapla()
	{
		System.out.println("Üçgenin Hacmi Olmaz.");
	}
	
	public void hareket()
	{
		System.out.println("Üçgenin Hareketi.");
	}
	
	public void fiziki()
	{
		System.out.println("Üçgenin Fiziği.");
	}
	

}
