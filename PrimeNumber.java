package Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		
		
		for(int i=1;i<=1000;i++)
		{
			boolean isPrime=true;
			if(i>1)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
					}
				}
			}
			else
			{
				isPrime=false;
			}
			if(isPrime)
			System.out.println(i);
		}
		
		

	}

}
