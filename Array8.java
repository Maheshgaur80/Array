import java.util.Scanner;
class Array8 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int a1 [] =new int[sc.nextInt()];
		for (int i=0;i<a1.length;i++)
		{
					a1[i]=sc.nextInt();
		}
		int even=0;
		for (int i=0;i<a1.length;i++)
		{
			if (a1[i]%2==0)
			{
				System.out.println("it is even number"+a1[i]);
			}
		}
	}
}
