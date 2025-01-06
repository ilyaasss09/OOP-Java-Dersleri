
public class Student 
{
	public String ad;
	public String soyad;
	public int yas;
	
	public Student()
	{
		System.out.println("Ogrenci Default yapıcı çağrıldı");
	}
	
	public Student(String ad1,String soyad1,int yas1)
	{
		System.out.println("Ogrenci Parametreli yapıcı çağrıldı");
		this.ad=ad1;
		this.soyad=soyad1;
		this.yas=yas1;
	}
	
	public void kimsin()
	{
		System.out.println("Adım : "+this.ad);
		System.out.println("Soyadım : "+this.soyad);
		System.out.println("Yaşım : "+this.yas);
	}
}
