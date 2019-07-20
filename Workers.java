import java.util.Scanner;

public class Workers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    c[i]=scn.nextInt();
		}
		int t[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    t[i]=scn.nextInt();
		}
		int translator=0;
		int author=0;
		int at=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    if(t[i]==1)
		    {
		        
		        for(int j=i+1;j<n;j++)
		        {
		            if(t[j]==2)
		            {
		                translator=c[i];
		                author=c[j];
		               if(translator+author<min)
		               {
		                   min=translator+author;
		               }
		               else{
		                   translator=0;
		                   author=0;
		               }
		            }
		        }
		    }
		    else if(t[i]==2)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(t[j]==1)
		            {
		                author=c[i];
		                translator=c[j];
		                if(author+translator<min)
		                {
		                    min=author+translator;
		                }
		                else{
		                    translator=0;
		                    author=0;
		                }
		            }
		        }
		    }
		    else{
		        
		        if(c[i]<min)
		        {
		            min=c[i];
		        }
		        
		    }
		}
		
		System.out.println(min);

	}

}
