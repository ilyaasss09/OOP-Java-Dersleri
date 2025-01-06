import com.Final_Abstracts.Sekil;
import com.Final_Interfaces.Hareket;
import com.Final_Interfaces.Hesap;

public class Dortgen extends Sekil
					implements Hareket, Hesap
{
	private double kısaKenar;
	private double uzunKenar;
	
	public Dortgen()
	{
		
	}
	public Dortgen(double kısaKenar1, double uzunKenar1)
	{
		this.kısaKenar = kısaKenar1;
		this.uzunKenar = uzunKenar1;
	}
	
	public double cevre()
	{
		return 2*(kısaKenar + uzunKenar);
	}
	
	public double alan()
	{
		return kısaKenar * uzunKenar;
	}
	
	public void alanHesapla()
	{
		System.out.println("Dörtgenin Alanı: " + this.alan());
	}
	
	public void hacimHesapla()
	{
		System.out.println("Dörtgenin hacmi olmaz.");
	}
	
	public void hareket()
	{
		System.out.println("Dörtgen Hareketi");
	}
	
	public void fiziki()
	{
		System.out.println("Dörtgen Fiziği");
	}
}
