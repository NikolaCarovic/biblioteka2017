package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<knjiga> knjige = new LinkedList<knjiga>();
	
	@Override
	public void dodajKnjigu(knjiga k) {
		if( k == null)
			throw new RuntimeException("Knjga je null");
		knjige.add(k);
	}

	@Override
	public void obirsiKnjigu(knjiga k) {
		if( k == null)
			throw new RuntimeException("Knjga je null");
		knjige.remove(k);
	}

	@Override
	public LinkedList<knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn) {
		if(autor == null || isbn == 0 || naslov == null)
			throw new RuntimeException("Morate uneti neki kriterijum");
		LinkedList<knjiga> rezultati = new LinkedList<knjiga>();
		
		for (int i = 0; i < knjige.size(); i++) {
			if( knjige.get(i).getNaslov().contains(naslov))
				rezultati.add(knjige.get(i));
		}
		return rezultati;
	}

}
