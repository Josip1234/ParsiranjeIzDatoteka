package com.josip.teèaj.modeli;

public class Zaglavlje {
private int brojTeèajnice;
private Datum datumIzrade;
private Datum datumPrimjene;
private int brojSlogovaKojiSlijedi;


public Zaglavlje() {
	
}

public Zaglavlje(int brojTeèajnice, Datum datumIzrade, Datum datumPrimjene, int brojSlogovaKojiSlijedi) {

	this.brojTeèajnice = brojTeèajnice;
	this.datumIzrade = datumIzrade;
	this.datumPrimjene = datumPrimjene;
	this.brojSlogovaKojiSlijedi = brojSlogovaKojiSlijedi;
}

public int getBrojTeèajnice() {
	return brojTeèajnice;
}

public void setBrojTeèajnice(int brojTeèajnice) {
	this.brojTeèajnice = brojTeèajnice;
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




}
