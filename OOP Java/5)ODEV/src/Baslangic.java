import com.odev.*;

public class Baslangic 
{

	public static void main(String[] args) 
	{
		Computer com = new Computer();
		com.processor = "Intel";
		com.display();
		com.setRam(64);
		com.setScreenSize(144);
		
		System.out.println("\nPrivate Değişkenler");
		System.out.println(com.getRam() + " GB ram");
		System.out.println(com.getScreenSize() + " Hz ekran boyutu");
		
	}
}
