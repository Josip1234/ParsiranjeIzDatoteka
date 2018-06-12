package com.josip.teèaj.modeli;

public class Datum {
private int dan;
private int mjesec;
private int godina;
private String datum;

public Datum() {};

public Datum(int dan, int mjesec, int godina) {

	this.dan = dan;
	this.mjesec = mjesec;
	this.godina = godina;
	this.datum=String.valueOf(dan)+"."+String.valueOf(mjesec)+"."+String.valueOf(godina);
}

public String getDatum() {
	return datum;
}

public void setDatum(String datum) {
	this.datum = String.valueOf(getDan())+"."+String.valueOf(getMjesec())+"."+String.valueOf(getGodina());
}

public int getDan() {
	return dan;
}

public void setDan(int dan) {
	this.dan = dan;
}

public int getMjesec() {
	return mjesec;
}

public void setMjesec(int mjesec) {
	this.mjesec = mjesec;
}

public int getGodina() {
	return godina;
}

public void setGodina(int godina) {
	this.godina = godina;
}

@Override
public String toString(){
	
	return datum;
	
}

}
