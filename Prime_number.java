import java.util.Scanner;
class Primeno
{
	void Prime_utn(int n)
	{
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++)
			prime[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{
			if(prime[p] == true)
			{
				for(int i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}
		
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner O = new Scanner(Syatem.in);
		int n = O.nextInt();
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		Primeno g = new Primeno();
		g.Prime_utn(n);
	}
}

