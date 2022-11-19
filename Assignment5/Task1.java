package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>();
		l1.add("Java");
		l1.add("Selenium");
		l1.add("TestNG");
		l1.add("Git");
		l1.add("Github");
		
		List<String> l2=new ArrayList<String>();
		
		for(int i=l1.size()-1;i>=0;i--)
		{
			l2.add(l1.get(i));
		}
		System.out.println(l2);
	}

}
