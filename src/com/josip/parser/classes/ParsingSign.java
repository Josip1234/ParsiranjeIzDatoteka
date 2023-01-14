package com.josip.parser.classes;

import java.util.Arrays;

public class ParsingSign {
public static final String[] values= {"AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz","0123456789"};
public char[] listOFChars= {};
 
public char[] returnFieldOfChars() {
		String temp="";
   for (int i = 0; i < values.length; i++) {
	   temp+=values[i];
	   
	   
}
	
    setListOFChars(temp.toCharArray());
	return listOFChars;
}



public char[] getListOFChars() {
	return listOFChars;
}

public void setListOFChars(char[] listOFChars) {
	this.listOFChars = listOFChars;
}



}
