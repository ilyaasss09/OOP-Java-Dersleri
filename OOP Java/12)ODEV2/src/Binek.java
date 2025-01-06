import com.ODEV2_Abstracts.*;
import com.ODEV2_Interfaces.*;

public class Binek extends Vehicle 
					implements Elektrikli
{
	
	public String sur()
	{
		return "Sürülüyor.";
	}
	
	public String fren()
	{
		return "Frenleniyor.";
	}
	
	public void sarj()
	{
		System.out.println("Şarj ediliyor.");
	}
	public void degistir()
	{
		System.out.println("Değiştiriliyor.");
	}
	public void temizlen()
	{
		System.out.println("Temizleniyor.");
	}

}
