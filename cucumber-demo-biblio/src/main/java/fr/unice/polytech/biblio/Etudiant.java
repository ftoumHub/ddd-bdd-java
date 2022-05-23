package fr.unice.polytech.biblio;

import java.time.LocalDate;
import java.util.*;


public class Etudiant {

	private final String nom;
	private final int noEtudiant;
	private final Bibliotheque bibliotheque;
	private final Collection<Emprunt> emprunt;

	public Etudiant(String nom, int noEtudiant, Bibliotheque bibliotheque) {
		this.nom = nom;
		this.noEtudiant = noEtudiant;
		this.bibliotheque = bibliotheque;
		this.emprunt = new ArrayList<>();
	}

	public String getNom() {
		return this.nom;
	}

	public int getNoEtudiant() {
		return this.noEtudiant;
	}

	public Collection<Emprunt> getEmprunt() {
		return emprunt;
	}

	public int getNombreDEmprunt() {
		return emprunt.size();
	}

	public void emprunte(Livre livre) {
		Emprunt e = new Emprunt(LocalDate.now().plusDays(15), this, livre);
		livre.setEmprunte(true);
		emprunt.add(e);
	}
}