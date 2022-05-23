Feature: Todo app

  Scenario: Ajouter une tache
    Given J'ai une liste nommée "Todo list"
    When J'ajoute une tache
    Then ma liste contient une tache
