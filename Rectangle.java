import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		
		while(t>0)
		{
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=scn.nextInt();
			int d=scn.nextInt();
			
			if((a==b&&c==d)||(a==c&&b==d)||(a==d&&b==c))
			  {
			      System.out.println("YES");
			  }
			  else{
			      System.out.println("NO");
			  }
			  t--;
		}
	}

}
