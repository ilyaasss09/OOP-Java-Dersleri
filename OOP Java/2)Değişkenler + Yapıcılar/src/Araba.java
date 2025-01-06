
public class Araba 
{	
	public String model;
	public String marka;
	public double yas;
	
	public Araba()
	{
		System.out.println("Araba default yapıcı");
	}
	
	public Araba(String model1,String marka1, double yas1)
	{
		System.out.println("Araba parametreli yapıcı");
		
		this.model = model1;
		this.marka = marka1;
		this.yas = yas1;
		
	}
	
	public void ozellikSoyle()
	{
		System.out.println("Model: " + this.model);
		System.out.println("Marka: " + this.marka);
		System.out.println("Yas: " + this.yas);

	}	
}
