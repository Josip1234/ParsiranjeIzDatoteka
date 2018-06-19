package com.josip.teèaj.modeli;

public class Artikli {	
private String sifra;
private String naziv;
private String jedinicaMjere;

public Artikli() {
	
}
public Artikli(String sifra, String naziv, String jedinicaMjere) {
	this.sifra = sifra;
	this.naziv = naziv;
	this.jedinicaMjere = jedinicaMjere;
}
public String getSifra() {
	return sifra;
}
public void setSifra(String sifra) {
	this.sifra = sifra;
}
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public String getJedinicaMjere() {
	return jedinicaMjere;
}
public void setJedinicaMjere(String jedinicaMjere) {
	this.jedinicaMjere = jedinicaMjere;
}

}
