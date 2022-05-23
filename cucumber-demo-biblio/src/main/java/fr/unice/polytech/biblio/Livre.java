package fr.unice.polytech.biblio;

public class Livre {

	private String titre;
	private String[] auteurs;
	private String isbn;
	private boolean emprunte;
	private Bibliotheque bibliotheque;
	private Emprunt emprunt;

	public Livre(Bibliotheque biblio) {
		this.bibliotheque = biblio;
		emprunte = false;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String[] getAuteurs() {
		return this.auteurs;
	}

	public void setAuteurs(String[] auteurs) {
		this.auteurs = auteurs;
	}

	public boolean getEmprunte() {
		return this.emprunte;
	}

	public void setEmprunte(boolean emprunte) {
		this.emprunte = emprunte;
	}

}