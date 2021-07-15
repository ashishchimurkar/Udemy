
public class Pattern3 {
	

/* 
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

    */
   
	
	public static void main(String[] args) {
		
		for (int i=1;i<=5; i++)
		{
			for (int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k=1; k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		for (int a=1;a<=5; a++)
		{
			for (int m=1; m<=a; m++)
			{
				System.out.print(" ");
			}
			
			for (int n=4; n>=a;n--)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
