package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.knjiga;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(knjiga k);
	public void obirsiKnjigu(knjiga k);
	public LinkedList<knjiga> vratiSveKnjige();
	public LinkedList<knjiga> pronadjiKnjigu(String naslov);
		
}
