package com.josip.tečaj.modeli;

public class Valute {
private int šifraValute;
private String oznakaValute;
private int brojJedinica;
private double kupovniTečaj;
private double srednjiTečaj;
private double prodajniTečaj;

public Valute() {}

public Valute(int šifraValute, String oznakaValute, int brojJedinica, double kupovniTečaj, double srednjiTečaj,
		double prodajniTečaj) {
	this.šifraValute = šifraValute;
	this.oznakaValute = oznakaValute;
	this.brojJedinica = brojJedinica;
	this.kupovniTečaj = kupovniTečaj;
	this.srednjiTečaj = srednjiTečaj;
	this.prodajniTečaj = prodajniTečaj;
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

public double getKupovniTečaj() {
	return kupovniTečaj;
}

public void setKupovniTečaj(double kupovniTečaj) {
	this.kupovniTečaj = kupovniTečaj;
}

public double getSrednjiTečaj() {
	return srednjiTečaj;
}

public void setSrednjiTečaj(double srednjiTečaj) {
	this.srednjiTečaj = srednjiTečaj;
}

public double getProdajniTečaj() {
	return prodajniTečaj;
}

public void setProdajniTečaj(double prodajniTečaj) {
	this.prodajniTečaj = prodajniTečaj;
}

@Override
public String toString() {
	return "Valute [šifraValute=" + šifraValute + ", oznakaValute=" + oznakaValute + ", brojJedinica=" + brojJedinica
			+ ", kupovniTečaj=" + kupovniTečaj + ", srednjiTečaj=" + srednjiTečaj + ", prodajniTečaj=" + prodajniTečaj
			+ "]";
};



}
