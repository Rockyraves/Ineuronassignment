package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		
		int [] number= {10,20,30,40,50};
		
		List list=new ArrayList();
		
		for(int i=0;i<number.length;i++)
		{
			list.add(number[i]);
			
		}
		System.out.println(list);

	}

}
