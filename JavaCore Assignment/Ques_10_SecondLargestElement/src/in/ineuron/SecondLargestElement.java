package in.ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			System.out.println("Enter the "+(i+1)+" element -->  ");
			int x=sc.nextInt();
			list.add(x);
		}
		Integer sec = findSecondLagestElement(list);
		System.out.println(list);
		if(sec==null) {
			System.out.println("All the elements in the list is equal");
		}else
		System.out.println("Second Largest Element are --> "+sec);
	}
	
	public static Integer findSecondLagestElement(List<Integer> list) {
		Integer first=list.get(0);
		Integer sec=null;
		for (int i=1;i<list.size();i++) {
			if(first<list.get(i)) {
				sec=first;
				first=list.get(i);
			}
		}
		return sec;
	}
}
