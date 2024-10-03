package week3day2homeassighnment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingcollection {

	public static void main(String[] args) {
		
		String[] comNames = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> com = new ArrayList<String>();
		for(int i=0;i<=comNames.length-1;i++) {
			com.add(comNames[i]);
		}
		Collections.sort(com);
				for(int i=com.size()-1;i>=0;i--) {
			System.out.print(com.get(i) + " ");

}
	}
}
