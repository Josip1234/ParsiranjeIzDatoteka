package com.josip.tečaj.modeli;

public class Zaglavlje {
private int brojTečajnice;
private Datum datumIzrade;
private Datum datumPrimjene;
private int brojSlogovaKojiSlijedi;


public Zaglavlje() {
	
}

public Zaglavlje(int brojTečajnice, Datum datumIzrade, Datum datumPrimjene, int brojSlogovaKojiSlijedi) {

	this.brojTečajnice = brojTečajnice;
	this.datumIzrade = datumIzrade;
	this.datumPrimjene = datumPrimjene;
	this.brojSlogovaKojiSlijedi = brojSlogovaKojiSlijedi;
}

public int getBrojTečajnice() {
	return brojTečajnice;
}

public void setBrojTečajnice(int brojTečajnice) {
	this.brojTečajnice = brojTečajnice;
}

public Datum getDatumIzrade() {
	return datumIzrade;
}

public void setDatumIzrade(Datum datumIzrade) {
	this.datumIzrade = datumIzrade;
}

public Datum getDatumPrimjene() {
	return datumPrimjene;
}

public void setDatumPrimjene(Datum datumPrimjene) {
	this.datumPrimjene = datumPrimjene;
}

public int getBrojSlogovaKojiSlijedi() {
	return brojSlogovaKojiSlijedi;
}

public void setBrojSlogovaKojiSlijedi(int brojSlogovaKojiSlijedi) {
	this.brojSlogovaKojiSlijedi = brojSlogovaKojiSlijedi;
}

@Override
public String toString() {
	return "Zaglavlje [brojTečajnice=" + brojTečajnice + ", datumIzrade=" + datumIzrade + ", datumPrimjene="
			+ datumPrimjene + ", brojSlogovaKojiSlijedi=" + brojSlogovaKojiSlijedi + "]";
}




}
