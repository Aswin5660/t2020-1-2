import java.util.*;
public class Program1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		int rows = sc.nextInt();
	
		for(int i=1;i<=rows; i++)
		{
			
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j+" ");
				System.out.print("*");
			}
			System.out.println();
			
		}
		sc.close();
	}
}
