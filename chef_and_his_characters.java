import java.util.Scanner;

public class chef_and_his_characters {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long t=scn.nextInt();
		while(t>0)
		{
			String s=scn.next();
			int count=0;
			
			if(lovelysentence(s))
			{
				count=ways(s);
				System.out.println("lovely "+count);
			}
			else
			{
				System.out.println("normal");
			}
			t--;
		}
		
	}
	public static boolean lovelysentence(String str)
	{
		for(int i=0;i<=str.length()-4;i++)
		{
			if(str.charAt(i)=='c'||str.charAt(i)=='h'||str.charAt(i)=='e'||str.charAt(i)=='f')
			{
				char c1=str.charAt(i);
				if(str.charAt(i+1)!=c1&&(str.charAt(i+1)=='c'||str.charAt(i+1)=='h'||str.charAt(i+1)=='e'||str.charAt(i+1)=='f'))
				{
					char c2=str.charAt(i+1);
					if(str.charAt(i+2)!=c2&&(str.charAt(i+2)=='c'||str.charAt(i+2)=='h'||str.charAt(i+2)=='e'||str.charAt(i+2)=='f'))
					{
						char c3=str.charAt(i+2);
						if(str.charAt(i+3)!=c3&&(str.charAt(i+3)=='c'||str.charAt(i+3)=='h'||str.charAt(i+3)=='e'||str.charAt(i+3)=='f'))
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static int ways(String str)
	{
		int count=0;
		
		for(int i=0;i<=str.length()-4;i++)
		{
			if(str.charAt(i)=='c'||str.charAt(i)=='h'||str.charAt(i)=='e'||str.charAt(i)=='f')
			{
				char c1=str.charAt(i);
				if(str.charAt(i+1)!=c1&&(str.charAt(i+1)=='c'||str.charAt(i+1)=='h'||str.charAt(i+1)=='e'||str.charAt(i+1)=='f'))
				{
					char c2=str.charAt(i+1);
					if(str.charAt(i+2)!=c2&&str.charAt(i+2)!=c1&&(str.charAt(i+2)=='c'||str.charAt(i+2)=='h'||str.charAt(i+2)=='e'||str.charAt(i+2)=='f'))
					{
						char c3=str.charAt(i+2);
						if(str.charAt(i+3)!=c3&&str.charAt(i+3)!=c2&&str.charAt(i+3)!=c1&&(str.charAt(i+3)=='c'||str.charAt(i+3)=='h'||str.charAt(i+3)=='e'||str.charAt(i+3)=='f'))
						{
							count++;
						}
					}
				}
			}
		}
		return count;
		
		
	}

}
