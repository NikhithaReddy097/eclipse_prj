package light;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.print(" ");
			for(int j=i-1;j>=1;j--)
				System.out.print(j);
			System.out.println();
		}

	}

}
