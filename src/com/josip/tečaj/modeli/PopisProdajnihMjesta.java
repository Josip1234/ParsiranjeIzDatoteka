package com.josip.teèaj.modeli;

public class PopisProdajnihMjesta {
private String sifra;
private String nazivProdajnogMjesta;
public PopisProdajnihMjesta() {
}
public PopisProdajnihMjesta(String sifra, String nazivProdajnogMjesta) {
	this.sifra = sifra;
	this.nazivProdajnogMjesta = nazivProdajnogMjesta;
}
public String getSifra() {
	return sifra;
}
public void setSifra(String sifra) {
	this.sifra = sifra;
}
public String getNazivProdajnogMjesta() {
	return nazivProdajnogMjesta;
}
public void setNazivProdajnogMjesta(String nazivProdajnogMjesta) {
	this.nazivProdajnogMjesta = nazivProdajnogMjesta;
}
@Override
public String toString() {
	return "PopisProdajnihMjesta [sifra=" + sifra + ", nazivProdajnogMjesta=" + nazivProdajnogMjesta + "]";
}

}
