package io.cucumber.skeleton;

import java.util.List;

public class TodoList {

    private final String nom;
    private final List<String> listeTaches;

    public TodoList(String nom, List<String> listeTaches) {
        this.nom = nom;
        this.listeTaches = listeTaches;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getListeTaches() {
        return listeTaches;
    }

    public void add(String tache) {
        this.getListeTaches().add(tache);
    }
}
