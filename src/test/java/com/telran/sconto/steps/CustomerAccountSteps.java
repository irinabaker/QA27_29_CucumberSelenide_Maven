package com.telran.sconto.steps;

import com.telran.sconto.pages.CustomerAccountPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class CustomerAccountSteps implements En {

    CustomerAccountPage customerAccount;

    public CustomerAccountSteps() {

        Then("User name displayed",() -> {
            customerAccount = page(CustomerAccountPage.class);
            customerAccount.accountTitleDisplayed().should(exist);
        });
    }
}
