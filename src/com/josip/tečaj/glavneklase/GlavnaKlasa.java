package com.josip.teèaj.glavneklase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.josip.teèaj.modeli.Artikli;
import com.josip.teèaj.modeli.Datum;
import com.josip.teèaj.modeli.Valute;
import com.josip.teèaj.modeli.Zaglavlje;



public class GlavnaKlasa {

  
	public static void main(String[] args) {
		
	   //otvoriDatoteku("artikli.txt");
	   //otvoriDatoteku("cjenik.txt");	
	   otvoriArtikle();
	   //otvoriTecaj();
	   //otvoriDatoteku("pm.txt");
	   //otvoriDatoteku("stanja.txt");	
	}
	public static void otvoriArtikle() {
		parsirajArtikle("artikli.txt");
	}
	public static List<Artikli>  parsirajArtikle(String imeDatoteke) {
		Artikli artikli = new Artikli();
		List<Artikli> art=new ArrayList<Artikli>();
		 Scanner inputStream = null;
		 int brojLinije=0;
		 int velicina=7;
		  try
		    {
		   inputStream =
		  new Scanner(new FileInputStream(imeDatoteke));
		  
		    }
		   catch(FileNotFoundException e)
		   {
		   System.out.println("Problem opening files.");
		   System.exit(0);
		    }
		  String line = null;
		   
		   while (inputStream.hasNextLine( )) {
			   brojLinije++;   
			    line = inputStream.nextLine( );
			    
			    artikli.setSifra(vratiString(line));
			    
			    int iskoristeniZnakovi=velicina;
			    line=prekriziLiniju(line, iskoristeniZnakovi);
			    iskoristeniZnakovi=1;
			    line=prekriziLiniju(line, iskoristeniZnakovi);
			    
			  
			    artikli.setNaziv(vratiString(line));
			    System.out.println(vratiVelicinuDoLinije(line));
			    System.out.println(artikli.getNaziv());
			    
			    
			    
		   }
		   inputStream.close( );
		   return art;
	}
	public static void otvoriTecaj() {
		Map<Zaglavlje,List<Valute>> map=new HashMap<Zaglavlje,List<Valute>>();
		 map=otvoriDatotekuValuta("f311217.dat.txt");
		 ispisiMapu(map);
		 //otvoriDatoteku("f311217.dat.txt");
	}
	public static void ispisiMapu(Map<Zaglavlje,List<Valute>> ma) {
		for(Map.Entry<Zaglavlje, List<Valute>> entry: ma.entrySet()) {
			System.out.println(entry.getKey().toString());
			System.out.println(entry.getValue().toString());
		}
		
	}
	
   public static Map<Zaglavlje, List<Valute>> otvoriDatotekuValuta(String ime) {
	       Map<Zaglavlje, List<Valute>> mapa = new HashMap<Zaglavlje, List<Valute>>();
	       List<Valute> valuta = new ArrayList<Valute>();
	       Zaglavlje zaglavlje = new Zaglavlje();
	       
		   Scanner inputStream = null;
		   int brojLinije=0;
		   int velicina=3;
		   try
		    {
		   inputStream =
		  new Scanner(new FileInputStream(ime));
		  
		    }
		   catch(FileNotFoundException e)
		   {
		   System.out.println("Problem opening files.");
		   System.exit(0);
		    }
		   String line = null;
		   
		   while (inputStream.hasNextLine( ))
		    {
			brojLinije++;   
		    line = inputStream.nextLine( );
		    if(brojLinije==1 && (ime=="f311214.dat.txt" || ime=="f311217.dat.txt")) {
		    	
		    	zaglavlje.setBrojTeèajnice(vratiBroj(line,velicina));
		    	//System.out.println(zaglavlje.getBrojTeèajnice());
		    	Datum datum = new Datum();
		    	line=prekriziLiniju(line, velicina);
		    	//System.out.println(ispisiZnak(line));
		    	int iskoristeno=velicina+2;
		    	velicina=2;
		    	datum.setDan(vratiBroj(line,velicina));
		    	line=prekriziLiniju(line,velicina);
		    	//System.out.println(ispisiZnak(line));
		    	iskoristeno=iskoristeno+2;
		    	//System.out.println(ispisiBrojIskoristenihZnakova(iskoristeno));
		    	velicina=2;
		    	datum.setMjesec(vratiBroj(line, velicina));
		        line=prekriziLiniju(line, velicina);
		        //System.out.println(ispisiZnak(line));
		        iskoristeno=iskoristeno+velicina;
		        //System.out.println(ispisiBrojIskoristenihZnakova(iskoristeno));
		        velicina=4;
		        datum.setGodina(vratiBroj(line,velicina));
		        line=prekriziLiniju(line, velicina);
		        //System.out.println(ispisiZnak(line));
		        iskoristeno=iskoristeno+velicina;
		        //System.out.println(ispisiBrojIskoristenihZnakova(iskoristeno));
		        zaglavlje.setDatumIzrade(postaviIIspisiDatum(datum));
		        Datum datum3 = new Datum();
		        velicina=2;
		        datum3.setDan(vratiBroj(line, velicina));
		        line=prekriziLiniju(line, velicina);
		        //System.out.println(ispisiZnak(line));
		        iskoristeno=iskoristeno+velicina;
		       // System.out.println(ispisiBrojIskoristenihZnakova(iskoristeno));
		        velicina=2;
		        datum3.setMjesec(vratiBroj(line, velicina));
		        line=prekriziLiniju(line, velicina);
		        iskoristeno=iskoristeno+velicina;
		        velicina=4;
		        datum3.setGodina(vratiBroj(line, velicina));
		        line=prekriziLiniju(line, velicina);
		        iskoristeno=iskoristeno+velicina;
		        zaglavlje.setDatumPrimjene(postaviIIspisiDatum(datum3));
		        velicina=2;
		        zaglavlje.setBrojSlogovaKojiSlijedi(vratiBroj(line, velicina));
		        line=prekriziLiniju(line, velicina);
		        iskoristeno=iskoristeno+velicina;
		        //ispisiBrojIskoristenihZnakova(iskoristeno);
		        //ispisiZaglavlje(zaglavlje);
		        
		    }else {
		    	
		    	Valute val = new Valute();
		    	line=zamijeniZarezSaToèkom(line);
		    	//ispisiLiniju(line);
		        val.setŠifraValute(vratiBroj(line, 3));
		        //System.out.println(val.getŠifraValute());
		        int iskoristeniZnakovi=3;
		        line=prekriziLiniju(line, iskoristeniZnakovi);
		        //ispisiBrojIskoristenihZnakova(iskoristeniZnakovi);
		        //ispisiLiniju(line);
		        val.setOznakaValute(vratiString(line, 3));
		        //System.out.println(val.getOznakaValute());
		        iskoristeniZnakovi=iskoristeniZnakovi+3;
		    	line=prekriziLiniju(line,3);
		    	
		    	val.setBrojJedinica(vratiBroj(line, 3));
		    	//System.out.println(val.getBrojJedinica());
		    	iskoristeniZnakovi=iskoristeniZnakovi+4;
		    	line=prekriziLiniju(line, iskoristeniZnakovi);
		    	
		    	val.setKupovniTeèaj(vratiDupliBroj(line, 8));
		    	//System.out.println(val.getKupovniTeèaj());
		    	iskoristeniZnakovi=iskoristeniZnakovi+5;
		    	line=prekriziLiniju(line, iskoristeniZnakovi);
		    	
		    	
		    	val.setSrednjiTeèaj((vratiDupliBroj(line, 8)));
		    	//System.out.println(val.getSrednjiTeèaj());
		    	//iskoristeniZnakovi=iskoristeniZnakovi;
		    	line=prekriziLiniju(line, iskoristeniZnakovi);
		    	//System.out.println(ispisiBrojIskoristenihZnakova(iskoristeniZnakovi));
		    	//ispisiLiniju(line);
		    	
		    	val.setProdajniTeèaj(vratiDupliBroj(line, 8));
		    	//System.out.println(val.getProdajniTeèaj());
		    	//iskoristeniZnakovi=iskoristeniZnakovi;
		    	//line=prekriziLiniju(line, iskoristeniZnakovi);
		        //ispisiBrojIskoristenihZnakova(iskoristeniZnakovi);
		        //ispisiLiniju(line);
		    	valuta.add(val);
		    	
		    }
		    
		    
		    //System.out.println(String.valueOf(brojLinije)+" "+line);
		    }
		    inputStream.close( );
		    mapa.put(zaglavlje, valuta);
		    return mapa;
		  
   }
  
    
   public static int vratiBroj(String linija,int velicinaPolja) {
	 char[] znak = new char[velicinaPolja];
	 for (int i = 0; i < znak.length; i++) {
		 
		znak[i]=linija.charAt(i);
		//System.out.println(znak[i]);
		
	}
	 String spoji=spojiLinije(znak,velicinaPolja);
	// System.out.println(spoji);
	 int vrijednost=Integer.parseInt(spoji);
	return vrijednost;   
	 
   }
   public static double vratiDupliBroj(String linija,int velicinaPolja) {
	    
		 char[] znak = new char[velicinaPolja];
		 for (int i = 0; i < znak.length; i++) {
			 
			znak[i]=linija.charAt(i);
			if(znak[i]==' ') {
				znak[i]=0;
			}
			//System.out.println(znak[i]);
			
		}
		 String spoji=spojiLinije(znak,velicinaPolja);
		 
		// System.out.println(spoji);
		 double vrijednost;
		try {
			vrijednost = Double.parseDouble(spoji);
		} catch (NumberFormatException e) {
			vrijednost=0.00;
			
		}
		
		return vrijednost;   
		 
	   }
   public static String vratiString(String linija) {
	  
	   int velicina=0;
	   char[] znak=new char[linija.length()];
	   for (int i = 0; i < linija.length(); i++) {
		  
		   if(linija.charAt(i)=='|') break; 
		   else {
		   
		znak[i]=linija.charAt(i);
		velicina++;
		   }
	}
	   String spoji=spojiLinije(znak,velicina);
	   return spoji;
   }
   
   
   public static int vratiVelicinuDoLinije(String linija) {
		  
	   int velicina=0;
	   char[] znak=new char[linija.length()];
	   for (int i = 0; i < linija.length(); i++) {
		  
		   if(linija.charAt(i)=='|') {break;
		   }else {
		znak[i]=linija.charAt(i);
		velicina++;
		   }
	}
	   
	   return velicina;
   }
   
   
   
   
   
   public static String vratiString(String linija,int velicinaPolja) {
	     
	     
		 char[] znak = new char[velicinaPolja];
		 for (int i = 0; i < znak.length; i++) {
			 
			znak[i]=linija.charAt(i);
			//System.out.println(znak[i]);
			
		}
		 String spoji=spojiLinije(znak,velicinaPolja);
		// System.out.println(spoji);
		
		return spoji;   
		 
	   }
   public static String spojiLinije(char[] polje,int velicina) {
		 String spojiTu="";
		 for (int i = 0; i < polje.length; i++) {
			spojiTu+=polje[i];
		}
		return spojiTu;   
		 
	   }
  public static String prekriziLiniju(String linija, int iskoristeniZnakovi) {
	  
	return linija.substring(iskoristeniZnakovi);
	  
  }
 
  public static String ispisiZnak(String znak) {
	  return "Trenutni znak bez poèetnog:"+znak;
  }
  public static String ispisiBrojIskoristenihZnakova(int velicina) {
	  return "Iskorištenih znakova:"+velicina;
  }
  public static Datum postaviIIspisiDatum(Datum datum) {
	  Datum datum2=new Datum(datum.getDan(),datum.getMjesec(),datum.getGodina());
      //System.out.println(datum2.getDatum());
      return datum2;
  }

  public static void ispisiZaglavlje(Zaglavlje zaglavlje) {
	  System.out.println(zaglavlje.getBrojTeèajnice()+" "+zaglavlje.getDatumIzrade()+" "+zaglavlje.getDatumPrimjene()+" "+zaglavlje.getBrojSlogovaKojiSlijedi());
  }
	
 
  public static String zamijeniZarezSaToèkom(String linija) {
	  char znak[]=new char[linija.length()];
	  for (int i = 0; i < znak.length; i++) {
		znak[i]=linija.charAt(i);
		if(znak[i]==','){
				znak[i]='.';
		}
		//System.out.println(znak[i]);
		
	}
	  
	  return spojiLinije(znak, linija.length());
	  
  }
  public static void ispisiLiniju(String linija) {
	 System.out.println(linija);
  }


}
