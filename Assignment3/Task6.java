package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		l1.add(77);
		l1.add(88);
	//-----------------------------------------------------------------------------	
		l1.remove(1);
		System.out.println(l1);//[33, 55, 66, 77, 88]
		l1.remove(Integer.valueOf(55));//Need to remove 55 from list using value.
		System.out.println(l1);//[33, 66, 77, 88]
	//------------------------------------------------------------------------------	
		ListIterator<Integer> list=l1.listIterator();
		
		
		while(list.hasNext())
		{
			if(list.nextIndex()==3)
			{
				list.set(90);
			}
			list.next();
		}
		
		System.out.println(l1);//[33, 66, 90, 88]
		
	//---------------------------------------------------------------------------	
		for(int e:l1)
		{
			System.out.println(e);
		}
		//-------------------------------------------------------
		
		int[] arr=new int[l1.size()];
		for(int i=0;i<l1.size();i++)
		{
			arr[i]=l1.get(i);
			System.out.println(arr[i]);
		}
		
		
		
		
		//-------------------------------------------------
		

		
		
		

	}

}
