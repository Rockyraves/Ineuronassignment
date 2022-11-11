package Assignment3;


import java.util.ArrayList;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {

		List<String> list1=new ArrayList<String>();
		list1.add("Web Automation");
		list1.add("API Automation");
		list1.add("Mobile Automation");
	
		

		for(String str:list1)
		{
			if(str.contains("Mobile"))
				System.out.println("True");
			break;
		}
		
			
	}

}
