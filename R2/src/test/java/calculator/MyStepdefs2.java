package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs2 {
    private Calculator calculator;
    private int input;
    private String opt;
    private float result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^one input and opt, (-?\\d+[.]?\\d*) and (sqr|rvs)$")
    public void twoInputValuesAnd(int arg0, String arg1) {
        input = arg0;
        this.opt = arg1;
    }


    @When("^I finish operating$")
    public void iStartOperating() {
        if (this.opt.equals("rvs"))
            result = calculator.reverse(this.input);
        else if (this.opt.equals("sqr"))
            result = calculator.sqrt(this.input);
    }

    @Then("^the result would be (-?\\d+[.]?\\d*)$")
    public void iExpectTheResult(float arg0) {
        Assert.assertEquals(arg0, result, 0.00001);

    }
}