package com.josip.teèaj.modeli;

public class Valute {
private int šifraValute;
private String oznakaValute;
private int brojJedinica;
private double kupovniTeèaj;
private double srednjiTeèaj;
private double prodajniTeèaj;

public Valute() {}

public Valute(int šifraValute, String oznakaValute, int brojJedinica, double kupovniTeèaj, double srednjiTeèaj,
		double prodajniTeèaj) {
	this.šifraValute = šifraValute;
	this.oznakaValute = oznakaValute;
	this.brojJedinica = brojJedinica;
	this.kupovniTeèaj = kupovniTeèaj;
	this.srednjiTeèaj = srednjiTeèaj;
	this.prodajniTeèaj = prodajniTeèaj;
}

public int getŠifraValute() {
	return šifraValute;
}

public void setŠifraValute(int šifraValute) {
	this.šifraValute = šifraValute;
}

public String getOznakaValute() {
	return oznakaValute;
}

public void setOznakaValute(String oznakaValute) {
	this.oznakaValute = oznakaValute;
}

public int getBrojJedinica() {
	return brojJedinica;
}

public void setBrojJedinica(int brojJedinica) {
	this.brojJedinica = brojJedinica;
}

public double getKupovniTeèaj() {
	return kupovniTeèaj;
}

public void setKupovniTeèaj(double kupovniTeèaj) {
	this.kupovniTeèaj = kupovniTeèaj;
}

public double getSrednjiTeèaj() {
	return srednjiTeèaj;
}

public void setSrednjiTeèaj(double srednjiTeèaj) {
	this.srednjiTeèaj = srednjiTeèaj;
}

public double getProdajniTeèaj() {
	return prodajniTeèaj;
}

public void setProdajniTeèaj(double prodajniTeèaj) {
	this.prodajniTeèaj = prodajniTeèaj;
};



}
