package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		Integer sum=0;
		
		for(int i=0;i<l1.size();i++)
		{
			sum=sum+l1.get(i);
		}
		
		System.out.println(sum);

	}

}
