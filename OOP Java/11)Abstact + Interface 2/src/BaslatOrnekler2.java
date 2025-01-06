import com.Ornekler2_Abstract.*;
import com.Ornekler2_Interface.*;
public class BaslatOrnekler2 
{

	public static void main(String[] args) 
	{	
		BinekArac a1 = new BinekArac(4);
		System.out.println(a1.sur());
		System.out.println(a1.dur());
		System.out.println(a1.yakitAl());
		a1.yıkat();
		a1.takviye();
		a1.dortxmod();
		a1.sarjOl();
		a1.koltukSayisi();
		
	}

}
