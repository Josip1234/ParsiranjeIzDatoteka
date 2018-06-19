package com.josip.teèaj.modeli;

public class ZaliheArtikala {
private String sifraArtikla;
private String sifraProdajnogMjesta;
private double kolicina;
public ZaliheArtikala(String sifraArtikla, String sifraProdajnogMjesta, double kolicina) {
	this.sifraArtikla = sifraArtikla;
	this.sifraProdajnogMjesta = sifraProdajnogMjesta;
	this.kolicina = kolicina;
}
public ZaliheArtikala() {
}
public String getSifraArtikla() {
	return sifraArtikla;
}
public void setSifraArtikla(String sifraArtikla) {
	this.sifraArtikla = sifraArtikla;
}
public String getSifraProdajnogMjesta() {
	return sifraProdajnogMjesta;
}
public void setSifraProdajnogMjesta(String sifraProdajnogMjesta) {
	this.sifraProdajnogMjesta = sifraProdajnogMjesta;
}
public double getKolicina() {
	return kolicina;
}
public void setKolicina(double kolicina) {
	this.kolicina = kolicina;
}


}
