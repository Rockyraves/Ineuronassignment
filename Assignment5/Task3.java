package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>();
		l1.add("Java");
		l1.add("TestNG");
		l1.add("Maven");
		l1.add("Java");
		
		List<String> l2=new ArrayList<String>();
		
		for(String e:l1)
		{
			if(!l2.contains(e))
			{
				l2.add(e);
			}
		}
		
		System.out.println(l2);
		

	}

}
