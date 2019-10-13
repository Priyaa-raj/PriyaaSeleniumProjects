package week3.day1;

public abstract class BrowserAbstract implements IBrowser{
	
	abstract String getUrl();
	
	public void getTitle()
	{
		System.out.println("Title");
	}
	
	public String getName()
	{
		return "Priyaa";
		
	}
	

}
