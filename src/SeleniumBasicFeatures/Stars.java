package SeleniumBasicFeatures;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(k=3;k>=i;k--)			
			System.out.print("  ");			
			for(j=1;j<=i;j++)			
			System.out.print(j+" ");
			
			System.out.println("");
		}
	}
}
