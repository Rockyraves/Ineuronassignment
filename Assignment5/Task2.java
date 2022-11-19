package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>();
		l1.add("Git");
		l1.add("Github");
		l1.add("Gitlab");
		l1.add("GitBash");
		l1.add("selenium");
		l1.add("Java");
		l1.add("Maven");
		
		List<String> l2=new ArrayList<String>();
		
		for(String e:l1)
		{
			if(e.startsWith("Git"))
			{
				l2.add(e);
				
			}
		}
		
		System.out.println(l2);
		

	}

}
