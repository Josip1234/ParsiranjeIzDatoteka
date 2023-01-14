package com.josip.parser.classes;

import java.util.Arrays;

public class ParsingSign {
public static final String[] values= {"AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz","0123456789"};
public char[] listOFChars= {};
public char[] temp= {};

public char[] returnFieldOfChars() {
    for (int i = 0; i < values.length; i++) {
	  separateStrings(values[i]);
	}
	return listOFChars;
}

public char[] separateStrings(String value) {
    for (int i = 0; i < value.length(); i++) {
	   
	   temp[i]=value.charAt(i);
	    System.out.println(temp[i]);
	}
    System.out.println(temp);
	return temp;
}


public char[] getListOFChars() {
	return listOFChars;
}

public void setListOFChars(char[] listOFChars) {
	this.listOFChars = listOFChars;
}



}
