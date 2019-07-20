import java.util.Scanner;

public class chef_and_glove {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{
		    int n=scn.nextInt();
		    int l[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        l[i]=scn.nextInt();
		    }
		    int g[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        g[i]=scn.nextInt();
		    }
		    int r[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        r[i]=g[n-i-1];
		    }
		    
		    int f1=0;
		    int f2=0;
		    String ans="";
		    for(int i=0;i<n;i++)
		    {
		        if(l[i]<=g[i])
		        {
		            f1=1;
		        }
		        else
		        {
		        	f1=0;
		        	break;
		        }
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(l[i]<=r[i])
		        {
		            f2=1;
		        }
		        else
		        {
		        	f2=0;
		        	break;
		        }
		    }
		    
		    if(f1==1&&f2==1)
		    {
		        System.out.println("both");
		    }
		    else if(f1==1)
		    {
		        System.out.println("front");
		    }
		    else if(f2==1)
		    {
		        System.out.println("back");
		    }
		    else{
		        System.out.println("none");
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    t--;
		}
	}

}
