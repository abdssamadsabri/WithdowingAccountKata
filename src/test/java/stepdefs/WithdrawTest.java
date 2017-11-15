package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Account;
import utils.Client;

import static org.junit.Assert.assertEquals;

public class WithdrawTest {

    private Client client;
    private Account account;

    @Given("^an existing client named \"([^\"]*)\" with (\\d+) EUR in his account$")
    public void an_existing_client_named_with_EUR_in_his_account(String arg1, double arg2) throws Throwable {
        client = new Client(arg1);
        account = new Account(arg2);
        client.setAccount(account);
    }

    @When("^he withdraws (\\d+) EUR from his account$")
    public void he_withdraws_EUR_from_his_account(double arg1) throws Throwable {
        client.getAccount().withdraw(arg1);
    }

    @Then("^the new balance is (\\d+) EUR$")
    public void the_new_balance_is_EUR(double arg1) throws Throwable {
        double newBalance = client.getAccount().getBalance();
        assertEquals(arg1, newBalance,0);
    }

}
