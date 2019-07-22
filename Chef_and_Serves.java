import java.util.Scanner;

public class Chef_and_Serves {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		String ans="CHEF";
		while(t>0)
		{
		    int p1=scn.nextInt();
		    int p2=scn.nextInt();
		    int k=scn.nextInt();
		    
		    System.out.println(ans);
		    if(ans=="CHEF")
		    {
		        ans="COOK";
		    }
		    else{
		        ans="CHEF";
		    }
		    
		    
		    t--;
		}

	}

}
