package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class TodoStepDefinitions {

    TodoList list;

    @Given("J'ai une liste nommée {string}")
    public void j_ai_une_liste_nommée(String string) {
        // Write code here that turns the phrase above into concrete actions
        list = new TodoList("Todo list", new ArrayList<>());
    }

    @When("J'ajoute une tache")
    public void j_ajoute_une_tache() {
        // Write code here that turns the phrase above into concrete actions
        list.add("une tache");
    }

    @Then("ma liste contient une tache")
    public void ma_liste_contient_une_tache() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("dtc");
    }
}
