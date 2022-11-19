package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
	
	ArrayList<Integer> l1=new ArrayList<>();
	l1.add(11);
	l1.add(22);
	l1.add(33);
	
	ArrayList<Integer> l2=new ArrayList<>();
	l2.add(9);
	l2.add(19);
	l2.add(29);
	
	ArrayList<Integer> l3=new ArrayList<>();
	l3.add(7);
	l3.add(17);
	l3.add(27);
	
	ArrayList<ArrayList<Integer>> l4=new ArrayList<>();
	l4.add(l1);
	l4.add(l2);
	l4.add(l3);
	
	System.out.println(l4);
	
	}

}
