package com.josip.te�aj.modeli;

public class Valute {
private int �ifraValute;
private String oznakaValute;
private int brojJedinica;
private double kupovniTe�aj;
private double srednjiTe�aj;
private double prodajniTe�aj;

public Valute() {}

public Valute(int �ifraValute, String oznakaValute, int brojJedinica, double kupovniTe�aj, double srednjiTe�aj,
		double prodajniTe�aj) {
	this.�ifraValute = �ifraValute;
	this.oznakaValute = oznakaValute;
	this.brojJedinica = brojJedinica;
	this.kupovniTe�aj = kupovniTe�aj;
	this.srednjiTe�aj = srednjiTe�aj;
	this.prodajniTe�aj = prodajniTe�aj;
}

public int get�ifraValute() {
	return �ifraValute;
}

public void set�ifraValute(int �ifraValute) {
	this.�ifraValute = �ifraValute;
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

public double getKupovniTe�aj() {
	return kupovniTe�aj;
}

public void setKupovniTe�aj(double kupovniTe�aj) {
	this.kupovniTe�aj = kupovniTe�aj;
}

public double getSrednjiTe�aj() {
	return srednjiTe�aj;
}

public void setSrednjiTe�aj(double srednjiTe�aj) {
	this.srednjiTe�aj = srednjiTe�aj;
}

public double getProdajniTe�aj() {
	return prodajniTe�aj;
}

public void setProdajniTe�aj(double prodajniTe�aj) {
	this.prodajniTe�aj = prodajniTe�aj;
};



}
