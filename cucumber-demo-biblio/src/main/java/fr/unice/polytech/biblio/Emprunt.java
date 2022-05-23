package fr.unice.polytech.biblio;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Emprunt {

	private LocalDate dateDeRetourMax;
	private Etudiant emprunteur;
	private Livre livreEmprunte;

}