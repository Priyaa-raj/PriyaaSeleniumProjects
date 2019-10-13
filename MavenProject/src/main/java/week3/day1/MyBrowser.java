package week3.day1;

public class MyBrowser {

	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.myName();
		br.getTitle();
		br.search();
		br.alert();
		br.close();

		Edge ed = new Edge();
		ed.myName();
		ed.getTitle();
		ed.search(1);
		ed.alert();
		ed.close();

		Chrome cr = new Chrome();
		cr.myName();
		cr.getTitle();
		cr.search();
		cr.alert();
		cr.close();

		Safari sf = new Safari();
		sf.myName();
		sf.getTitle();
		sf.alert();
		sf.search("Text");
		sf.close();
	}

}
