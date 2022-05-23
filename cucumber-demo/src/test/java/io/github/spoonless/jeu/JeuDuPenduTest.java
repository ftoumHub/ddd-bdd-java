package io.github.spoonless.jeu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, monochrome = false, plugin = {"pretty", "html:target/cucumber"})
public class JeuDuPenduTest {

}
