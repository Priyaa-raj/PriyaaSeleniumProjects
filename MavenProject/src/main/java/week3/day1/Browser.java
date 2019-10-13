package week3.day1;

public class Browser {
	
	void myName() {
		System.out.println("I am General Browser");
	}

	void getTitle() {
		System.out.println("Webpage Title");
	}

	void close() {
		System.out.println("Webpage Close");
	}

	void alert() {
		System.out.println("Error Loading Webpage!");
	}

	void search() {
		System.out.println("Webpage Search");
	}

	void search(String str) {
		if(str.equalsIgnoreCase("text"))
		System.out.println("String Search");
		else
			System.out.println("String search not possible");
	}

	void search(int a) {
		if (a == 1)
			System.out.println("Integer Search");
		else
			System.out.println("Integer search not possible");
	}

}
