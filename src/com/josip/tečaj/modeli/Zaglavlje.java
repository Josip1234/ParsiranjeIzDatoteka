package com.josip.te�aj.modeli;

public class Zaglavlje {
private int brojTe�ajnice;
private Datum datumIzrade;
private Datum datumPrimjene;
private int brojSlogovaKojiSlijedi;


public Zaglavlje() {
	
}

public Zaglavlje(int brojTe�ajnice, Datum datumIzrade, Datum datumPrimjene, int brojSlogovaKojiSlijedi) {

	this.brojTe�ajnice = brojTe�ajnice;
	this.datumIzrade = datumIzrade;
	this.datumPrimjene = datumPrimjene;
	this.brojSlogovaKojiSlijedi = brojSlogovaKojiSlijedi;
}

public int getBrojTe�ajnice() {
	return brojTe�ajnice;
}

public void setBrojTe�ajnice(int brojTe�ajnice) {
	this.brojTe�ajnice = brojTe�ajnice;
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
