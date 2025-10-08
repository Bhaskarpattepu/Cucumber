package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before
    public void start()
    {
        System.out.println("*****************************");
        System.out.println("Starting of scenario");
    }
    @After
    public void endOfScenario()
    {
        System.out.println("*****************************");
        System.out.println("Ending Of Scenario");
    }


    @Before("@NetBanking")
    public void  netBankingSetup()
    {
        System.out.println("Setup entires in NetBanking database");
    }
    @Before("@Regression")
    public void mortgageSetup()
    {
        System.out.println("Setup the entries in Mortgage");
    }
}
