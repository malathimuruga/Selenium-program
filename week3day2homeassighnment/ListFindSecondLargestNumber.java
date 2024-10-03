package week3day2homeassighnment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFindSecondLargestNumber {

	public static void main(String[] args) {
		
				
			
		int num []= {3, 2, 11, 4, 6, 7};
		
   List<Integer> unq=new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			unq.add(num[i]);
		}
		
		
		System.out.println(unq);
		Collections.sort(unq);
		System.out.println(unq);
		
		System.out.println(unq.get(4));
		

	}

}
