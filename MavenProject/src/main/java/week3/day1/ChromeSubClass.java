package week3.day1;

public class ChromeSubClass extends BrowserAbstract{
	
	public static void main(String[] args) {
		
		ChromeSubClass crobj = new ChromeSubClass();
		String url = crobj.getUrl();
		String name = crobj.getName();
		crobj.getTitle();
		String version = crobj.getVersion();
		
		System.out.println("URL is "+url);
		System.out.println("Name is "+name);
		System.out.println("Version is "+version);
	}

	@Override
	String getUrl() {
				return "www.google.com";
	}

	@Override
	public String getVersion()
	{
		return "1.2";
		
	}
	
	

}
