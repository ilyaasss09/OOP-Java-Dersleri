import com.WEEK11_Abstracts.*;
public class Baslat 
{

	public static void main(String[] args) 
	{
		Dortgen kare = new Dortgen(9.5, 9.5);
		
		System.out.println("Karenin Alanı: " + kare.alan());
		System.out.println("Karenin Alanı: " + kare.cevre());
		//kare.nerdesin();		protected methoda erişim hatası
		kare.hareket();
		kare.nerde();
		kare.move1();
		kare.move2();
		kare.move3();
		
	}

}
