package week1.day2;

public class EliminateArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ori = {1,2,1,22,23,34,44,33,34,22,1,34};
		
		int[] temp = new int[ori.length];
		
		for(int i=0;i<ori.length;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(ori[i]!=ori[j])
				{
					temp[i]=ori[i];
				}
			}
			System.out.println(temp[i]);
		}

		
	}

}
