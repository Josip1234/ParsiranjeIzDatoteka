package com.josip.parser.classes;

import java.util.Arrays;

public class ParsingSign {
public static final String[] values= {"AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz","0123456789"};
public char[] listOFChars;

public char[] returnFieldOfChars() {

		char[] vals=values[0].toCharArray();
		char[] vals1=values[1].toCharArray();
		
		listOFChars = new char[vals.length+vals1.length];
		int size_of_vals=vals.length;
		int size_of_vals1=vals1.length;
		
		
		
	       int placeOfTheIndexInVals1=listOFChars.length-vals.length;
        System.out.println("Difference "+placeOfTheIndexInVals1);
		for(int index1=vals.length;index1<=listOFChars.length;index1++) {
		
  
   
			for(int k=0; k<vals1.length;k++) {
		
				 listOFChars[k]=vals1[k];
				 
		
			
			}

		
			setListOFChars(listOFChars);
			placeOfTheIndexInVals1=size_of_vals1;

		
		
		}

		
		
	
		
		
		
	

	return listOFChars;
}



public char[] getListOFChars() {
	return listOFChars;
}

public void setListOFChars(char[] listOFChars) {
	this.listOFChars = listOFChars;
}



}
