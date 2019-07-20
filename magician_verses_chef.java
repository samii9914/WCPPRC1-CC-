import java.util.Scanner;

public class magician_verses_chef {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		
		while(t>0)
		{
		    int n=scn.nextInt();
		    int x=scn.nextInt();
		    int s=scn.nextInt();
		    int ans=x;
		    while(s>0)
		    {
		        int a=scn.nextInt();
		        int b=scn.nextInt();
		        if(a==ans&&a<=n)
		        {
		            ans=b;
		            
		        }
		        else if(b==ans&&b<=n)
		        {
		            ans=a;
		        }
		        s--;
		    }
		    
		    
		    
		    System.out.println(ans);
		    
		    
		    
		    
		    
		    
		    
		    t--;
		}
	}

}
