import java.util.Scanner;

public class Naive_Chef {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		    int t=scn.nextInt();
		    while(t>0)
		    {
		        int n=scn.nextInt();
		        int a=scn.nextInt();
		        int b=scn.nextInt();
		        int temp=n;
		        int counta=0;
		        int countb=0;
		        while(temp>0)
		        {
		            int d=scn.nextInt();
		            if(d==a)
		            {
		                counta++;
		            }
		            if(d==b)
		            {
		                countb++;
		            }
		            
		            temp--;
		        }
		        float ans=(((float)counta/n)*((float)countb/n));
		        System.out.println(ans);
		        
		        
		        
		        
		        t--;
		    }

	}

}
