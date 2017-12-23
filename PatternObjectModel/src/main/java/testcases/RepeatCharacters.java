package testcases;

import java.util.ArrayList;
import java.util.List;

public class RepeatCharacters {

	public static void main(String[] args) {
		
		
		String strrepeat = "ABBAXXABBAA";
		List <Integer> list1 = new ArrayList<Integer>();
		
		
		int count = 0;
		
			for(int i=0; i<strrepeat.length(); i++){
				if(strrepeat.charAt(i)=='A'){
					count++;
					
					list1.add(i);
				}
					
			}
			System.out.println("Count -"+count);
		
		for (Integer d1 : list1) {
			System.out.println(d1);
			
		}
		
		int m=list1.size()/2;
				
		System.out.println(list1.get(m));
			
			
		
		
	}

	
}
