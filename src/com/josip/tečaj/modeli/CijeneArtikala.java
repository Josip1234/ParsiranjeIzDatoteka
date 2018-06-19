package com.josip.teèaj.modeli;

public class CijeneArtikala {
public String sifraArtikla;
public double cijenaUKunama;

public CijeneArtikala() {
}
public CijeneArtikala(String sifraArtikla, double cijenaUKunama) {
	this.sifraArtikla = sifraArtikla;
	this.cijenaUKunama = cijenaUKunama;
}
public String getSifraArtikla() {
	return sifraArtikla;
}
public void setSifraArtikla(String sifraArtikla) {
	this.sifraArtikla = sifraArtikla;
}
public double getCijenaUKunama() {
	return cijenaUKunama;
}
public void setCijenaUKunama(double cijenaUKunama) {
	this.cijenaUKunama = cijenaUKunama;
}

}
