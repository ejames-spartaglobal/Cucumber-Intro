package com.spartaglobal.cucumber_introduction.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroductionStepDefs {

    @Given("I am a first time user of cucumber")
    public void i_am_a_first_time_user_of_cucumber() {
        System.out.println("Here is my given clause");
    }

    @And("I find cucumber interesting")
    public void i_find_cucumber_interesting() {
        System.out.println("I've added an and");
    }

    @When("I execute this script")
    public void i_execute_this_script() {
        System.out.println("Here is my when clause");

    }

    @Then("I will hopefully understand more about cucumber")
    public void i_will_hopefully_understand_more_about_cucumber() {
        System.out.println("Here is my then clause");

    }

    //Next Scenario

    @Given("I have an integer of {int}")
    public void i_have_an_integer_of(Integer int1) {
        System.out.println(int1);
    }

    @Then("I am able to print it")
    public void i_am_able_to_print_it() {
        System.out.println("It worked, woo");
    }

    //Next Scenario

    @Given("I have a float\\/double {double}")
    public void i_have_a_float_double(Double double1) {
        System.out.println(double1);
    }

    @Then("I can print this as well")
    public void i_can_print_this_as_well() {
        System.out.println("And another one");
    }

    //Next Scenario

    @Given("I have {int} {string}")
    public void i_have_the_fruit_banana(int fruitNum, String string1) {
        System.out.println(fruitNum +" "+string1);
    }

    @Then("I have to eat it nom nom nom")
    public void i_have_to_eat_it_nom_nom_nom() {
        System.out.println("nom nom nom");
    }
}
