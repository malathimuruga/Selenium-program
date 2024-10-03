package week3day2homeassighnment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		
		int num[]= {1, 2, 3, 4, 10, 6, 8};
	
		 List<Integer> mElmnt=new ArrayList<Integer>();
			
			for (int i = 0; i < num.length-1; i++) {
				
				mElmnt.add(num[i]);		
		
							}
			Collections.sort(mElmnt);
						
			for (int i = 0; i <mElmnt.size()-1; i++) {
				int current = mElmnt.get(i);
				int next = mElmnt.get(i + 1);
				if (current + 1 != next) {
					System.out.println("Missing element is :" + (current+1));
				}
			}		
	}

}
