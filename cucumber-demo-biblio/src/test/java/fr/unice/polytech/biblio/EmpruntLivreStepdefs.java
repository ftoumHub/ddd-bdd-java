package fr.unice.polytech.biblio;

import io.cucumber.java8.Fr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EmpruntLivreStepdefs implements Fr { // implements En si vos scénarios sont écrits en anglais

    private Bibliotheque biblio = new Bibliotheque();
    private Etudiant etudiant;
    private Livre livre;

    // implementation des steps dans le constructeur (aussi possible dans des méthodes)
    public EmpruntLivreStepdefs() {

        //// CONTEXTE:

        // besoin de refactorer int en Integer car utilisation de la généricité par Cucumber Java 8
        Etantdonné("un etudiant de nom {string} et de noEtudiant {int}", (String nomEtudiant, Integer noEtudiant) -> {
            Etudiant etu = new Etudiant(nomEtudiant, noEtudiant, biblio);
            biblio.addEtudiant(etu);
        });

        Et("un livre de titre {string}", (String titreLivre) -> {
            Livre liv = new Livre(biblio);
            liv.setTitre(titreLivre);
            biblio.addLivre(liv);
        });


        //// SCENARIO 1:

        Alors("Il y a {int} dans son nombre d'emprunts", (Integer nbEmprunts) -> {
            assertEquals(nbEmprunts.intValue(), etudiant.getNombreDEmprunt());
        });

        Quand("{string} demande son nombre d'emprunt", (String nomEtudiant) -> {
            etudiant = biblio.getEtudiantByName(nomEtudiant);
        });

        Quand("{string} emprunte le livre {string}", (String nomEtudiant, String titreLivre) -> {
            etudiant = biblio.getEtudiantByName(nomEtudiant);
            livre = biblio.getLivreByTitle(titreLivre);
            etudiant.emprunte(livre);
        });

        Et("Il y a le livre {string} dans un emprunt de la liste d'emprunts", (String titreLivre) -> {
            assertTrue(etudiant.getEmprunt().stream().
                    anyMatch(emp -> emp.getLivreEmprunte().getTitre().equals(titreLivre)));
        });

        Et("Le livre {string} est indisponible", (String titreLivre) -> {
            assertEquals(true, biblio.getLivreByTitle(titreLivre).getEmprunte());
        });
    }

}
