package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<knjiga> knjige = new LinkedList<knjiga>();
	
	@Override
	public void dodajKnjigu(knjiga k) {
		knjige.add(k);
	}

	@Override
	public void obirsiKnjigu(knjiga k) {
		knjige.remove(k);
	}

	@Override
	public LinkedList<knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<knjiga> pronadjiKnjigu(String naslov) {
		LinkedList<knjiga> rezultati = new LinkedList<knjiga>();
		for (int i = 0; i < knjige.size(); i++) {
			if( knjige.get(i).getNaslov().contains(naslov))
				rezultati.add(knjige.get(i));
		}
		return rezultati;
	}

}
